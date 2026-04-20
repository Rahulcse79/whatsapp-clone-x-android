/*
 * WhatsApp-style chat wallpaper.
 *
 * Renders the iconic cream (#ECE5DD) light / deep teal-black (#0B141A) dark background
 * with a low-opacity scattered "doodle" pattern (hearts, stars, dots, bubbles, leaves)
 * to evoke the WhatsApp default wallpaper without shipping bitmap assets.
 */

@file:Suppress("MagicNumber")

package io.element.android.features.messages.impl.timeline.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.dp
import io.element.android.compound.theme.ElementTheme
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

private val LightWallpaperColor = Color(0xFFECE5DD)
private val DarkWallpaperColor = Color(0xFF0B141A)

/**
 * A Box that fills its parent with the WhatsApp-style chat wallpaper, then renders [content] on top.
 */
@Composable
fun WhatsAppChatWallpaper(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    val isLight = ElementTheme.colors.isLight
    val baseColor = if (isLight) LightWallpaperColor else DarkWallpaperColor
    // Doodle ink color: very faint warm gray on light, faint warm white on dark.
    val doodleColor = if (isLight) Color(0xFF000000).copy(alpha = 0.05f) else Color(0xFFFFFFFF).copy(alpha = 0.04f)

    // Pre-generate a stable scatter of doodle positions/types; recompute only if size class changes.
    val doodles = remember {
        val rng = Random(seed = 42)
        List(70) {
            Doodle(
                xFrac = rng.nextFloat(),
                yFrac = rng.nextFloat(),
                rotationDeg = rng.nextFloat() * 360f,
                scale = 0.7f + rng.nextFloat() * 0.7f,
                kind = DoodleKind.entries[rng.nextInt(DoodleKind.entries.size)],
            )
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(baseColor)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            doodles.forEach { d ->
                val cx = d.xFrac * size.width
                val cy = d.yFrac * size.height
                val s = (size.minDimension * 0.022f) * d.scale
                translate(cx, cy) {
                    rotate(d.rotationDeg, pivot = Offset.Zero) {
                        when (d.kind) {
                            DoodleKind.Dot -> drawCircle(
                                color = doodleColor,
                                radius = s * 0.35f,
                                center = Offset.Zero,
                            )
                            DoodleKind.Ring -> drawCircle(
                                color = doodleColor,
                                radius = s,
                                center = Offset.Zero,
                                style = Stroke(width = 2f),
                            )
                            DoodleKind.Heart -> drawHeart(doodleColor, s)
                            DoodleKind.Star -> drawStar(doodleColor, s)
                            DoodleKind.Bubble -> drawSpeechBubble(doodleColor, s)
                            DoodleKind.Leaf -> drawLeaf(doodleColor, s)
                        }
                    }
                }
            }
        }
        content()
    }
}

private enum class DoodleKind { Dot, Ring, Heart, Star, Bubble, Leaf }

private data class Doodle(
    val xFrac: Float,
    val yFrac: Float,
    val rotationDeg: Float,
    val scale: Float,
    val kind: DoodleKind,
)

private fun DrawScope.drawHeart(color: Color, size: Float) {
    val path = Path().apply {
        // Two arcs + a triangle point
        moveTo(0f, size * 0.3f)
        cubicTo(-size, -size * 0.4f, -size * 0.4f, -size, 0f, -size * 0.2f)
        cubicTo(size * 0.4f, -size, size, -size * 0.4f, 0f, size * 0.3f)
        close()
    }
    drawPath(path = path, color = color, style = Stroke(width = 2f))
}

private fun DrawScope.drawStar(color: Color, size: Float) {
    val outer = size
    val inner = size * 0.45f
    val path = Path()
    for (i in 0 until 10) {
        val r = if (i % 2 == 0) outer else inner
        val a = (Math.PI / 5 * i - Math.PI / 2).toFloat()
        val x = cos(a) * r
        val y = sin(a) * r
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    drawPath(path = path, color = color, style = Stroke(width = 2f))
}

private fun DrawScope.drawSpeechBubble(color: Color, size: Float) {
    val w = size * 1.4f
    val h = size
    val path = Path().apply {
        addRoundRect(
            androidx.compose.ui.geometry.RoundRect(
                left = -w / 2f, top = -h / 2f, right = w / 2f, bottom = h / 2f,
                radiusX = h * 0.4f, radiusY = h * 0.4f,
            )
        )
        // Tail
        moveTo(-w * 0.2f, h / 2f)
        lineTo(-w * 0.35f, h * 0.85f)
        lineTo(-w * 0.05f, h / 2f)
        close()
    }
    drawPath(path = path, color = color, style = Stroke(width = 2f))
}

private fun DrawScope.drawLeaf(color: Color, size: Float) {
    val path = Path().apply {
        moveTo(0f, -size)
        cubicTo(size, -size * 0.3f, size, size * 0.3f, 0f, size)
        cubicTo(-size, size * 0.3f, -size, -size * 0.3f, 0f, -size)
        close()
    }
    drawPath(path = path, color = color, style = Stroke(width = 2f))
    // Spine
    drawLine(
        color = color,
        start = Offset(0f, -size),
        end = Offset(0f, size),
        strokeWidth = 1.5f,
    )
}

