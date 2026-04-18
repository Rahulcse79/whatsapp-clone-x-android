/*
 * WhatsApp-style color overrides for the Compound theme.
 * These provide a WhatsApp-like look while preserving the full SemanticColors contract.
 */

@file:Suppress("all")
package io.element.android.compound.theme

import androidx.compose.ui.graphics.Color
import io.element.android.compound.tokens.generated.SemanticColors

// ── WhatsApp brand palette ──────────────────────────────────────────
private object WaLight {
    val teal = Color(0xFF00A884)
    val tealDark = Color(0xFF008069)
    val tealLight = Color(0xFF25D366)
    val tealPale = Color(0xFFD9FDD3)
    val bg = Color(0xFFFFFFFF)
    val surface = Color(0xFFF0F2F5)
    val surfaceAlt = Color(0xFFE9EDEF)
    val textPrimary = Color(0xFF111B21)
    val textSecondary = Color(0xFF667781)
    val separator = Color(0xFFE9EDEF)
    val link = Color(0xFF027EB5)
    val red = Color(0xFFDC3545)
    val redSubtle = Color(0xFFFDE8E8)
    val blueInfo = Color(0xFF027EB5)
    val blueInfoSubtle = Color(0xFFE3F2FD)
    val readReceipt = Color(0xFF53BDEB)
    val disabled = Color(0xFFA0A4A8)
    val gray100 = Color(0xFFF7F8FA)
    val gray200 = Color(0xFFF0F2F5)
    val gray300 = Color(0xFFE9EDEF)
    val gray400 = Color(0xFFD1D7DB)
    val gray500 = Color(0xFF8696A0)
    val gray600 = Color(0xFF667781)
    val gray700 = Color(0xFF54656F)
    val gray800 = Color(0xFF3B4A54)
    val gray900 = Color(0xFF111B21)
}

private object WaDark {
    val teal = Color(0xFF00A884)
    val tealDark = Color(0xFF005C4B)
    val tealLight = Color(0xFF25D366)
    val tealPale = Color(0xFF005C4B)
    val bg = Color(0xFF111B21)
    val surface = Color(0xFF1F2C34)
    val surfaceAlt = Color(0xFF222D34)
    val textPrimary = Color(0xFFE9EDEF)
    val textSecondary = Color(0xFF8696A0)
    val separator = Color(0xFF222D34)
    val link = Color(0xFF53BDEB)
    val red = Color(0xFFF15C6D)
    val redSubtle = Color(0xFF3D1F24)
    val blueInfo = Color(0xFF53BDEB)
    val blueInfoSubtle = Color(0xFF172E3A)
    val readReceipt = Color(0xFF53BDEB)
    val disabled = Color(0xFF54656F)
    val gray100 = Color(0xFF1A262D)
    val gray200 = Color(0xFF1F2C34)
    val gray300 = Color(0xFF222D34)
    val gray400 = Color(0xFF2A3942)
    val gray500 = Color(0xFF3B4A54)
    val gray600 = Color(0xFF54656F)
    val gray700 = Color(0xFF8696A0)
    val gray800 = Color(0xFFACBBC2)
    val gray900 = Color(0xFFE9EDEF)
}

// ── Light WhatsApp SemanticColors ───────────────────────────────────
val whatsAppColorsLight = SemanticColors(
    bgAccentHovered = WaLight.tealDark,
    bgAccentPressed = WaLight.tealDark,
    bgAccentRest = WaLight.teal,
    bgAccentSelected = WaLight.tealPale,
    bgActionPrimaryDisabled = WaLight.disabled,
    bgActionPrimaryHovered = WaLight.tealDark,
    bgActionPrimaryPressed = WaLight.tealDark,
    bgActionPrimaryRest = WaLight.teal,
    bgActionSecondaryHovered = WaLight.gray200,
    bgActionSecondaryPressed = WaLight.gray300,
    bgActionSecondaryRest = WaLight.bg,
    bgActionTertiaryHovered = WaLight.gray200,
    bgActionTertiaryRest = WaLight.bg,
    bgActionTertiarySelected = WaLight.gray300,
    bgBadgeAccent = WaLight.tealLight,
    bgBadgeCritical = WaLight.red,
    bgBadgeDefault = WaLight.bg,
    bgBadgeInfo = WaLight.blueInfo,
    bgBadgePrimary = WaLight.gray900,
    bgBadgeSecondary = WaLight.gray400,
    bgCanvasDefault = WaLight.bg,
    bgCanvasDefaultLevel1 = WaLight.bg,
    bgCanvasDisabled = WaLight.gray200,
    bgCriticalHovered = WaLight.red,
    bgCriticalPrimary = WaLight.red,
    bgCriticalSubtle = WaLight.redSubtle,
    bgCriticalSubtleHovered = WaLight.redSubtle,
    bgDecorative1 = Color(0xFFE2F7CB),
    bgDecorative2 = Color(0xFFD4F4F4),
    bgDecorative3 = Color(0xFFF5D1EB),
    bgDecorative4 = Color(0xFFE8D4F5),
    bgDecorative5 = Color(0xFFF5D1D8),
    bgDecorative6 = Color(0xFFF5E0D1),
    bgInfoSubtle = WaLight.blueInfoSubtle,
    bgSubtlePrimary = WaLight.surface,
    bgSubtleSecondary = WaLight.gray200,
    bgSubtleSecondaryLevel0 = WaLight.gray200,
    bgSuccessSubtle = WaLight.tealPale,
    borderAccentPrimary = WaLight.teal,
    borderAccentSubtle = WaLight.teal.copy(alpha = 0.5f),
    borderCriticalHovered = WaLight.red,
    borderCriticalPrimary = WaLight.red,
    borderCriticalSubtle = WaLight.red.copy(alpha = 0.4f),
    borderDisabled = WaLight.gray400,
    borderFocused = WaLight.teal,
    borderInfoSubtle = WaLight.blueInfo.copy(alpha = 0.4f),
    borderInteractiveHovered = WaLight.gray800,
    borderInteractivePrimary = WaLight.gray500,
    borderInteractiveSecondary = WaLight.gray400,
    borderSuccessSubtle = WaLight.teal.copy(alpha = 0.4f),
    gradientActionStop1 = WaLight.tealLight,
    gradientActionStop2 = WaLight.teal,
    gradientActionStop3 = WaLight.teal,
    gradientActionStop4 = WaLight.tealDark,
    gradientCriticalStop1 = WaLight.redSubtle,
    gradientCriticalStop2 = WaLight.bg,
    gradientInfoStop1 = WaLight.blueInfoSubtle,
    gradientInfoStop2 = WaLight.bg,
    gradientSubtleStop1 = WaLight.teal.copy(alpha = 0.16f),
    gradientSubtleStop2 = WaLight.teal.copy(alpha = 0.12f),
    gradientSubtleStop3 = WaLight.teal.copy(alpha = 0.08f),
    gradientSubtleStop4 = WaLight.teal.copy(alpha = 0.04f),
    gradientSubtleStop5 = WaLight.teal.copy(alpha = 0.02f),
    gradientSubtleStop6 = Color.Transparent,
    iconAccentPrimary = WaLight.teal,
    iconAccentTertiary = WaLight.teal,
    iconCriticalPrimary = WaLight.red,
    iconDisabled = WaLight.disabled,
    iconInfoPrimary = WaLight.blueInfo,
    iconOnSolidPrimary = WaLight.bg,
    iconPrimary = WaLight.gray800,
    iconPrimaryAlpha = WaLight.gray800.copy(alpha = 0.9f),
    iconQuaternary = WaLight.gray500,
    iconQuaternaryAlpha = WaLight.gray500.copy(alpha = 0.5f),
    iconSecondary = WaLight.gray600,
    iconSecondaryAlpha = WaLight.gray600.copy(alpha = 0.7f),
    iconSuccessPrimary = WaLight.teal,
    iconTertiary = WaLight.gray500,
    iconTertiaryAlpha = WaLight.gray500.copy(alpha = 0.6f),
    separatorPrimary = WaLight.separator,
    textActionAccent = WaLight.teal,
    textActionPrimary = WaLight.gray900,
    textBadgeAccent = WaLight.tealDark,
    textBadgeInfo = WaLight.blueInfo,
    textCriticalPrimary = WaLight.red,
    textDecorative1 = Color(0xFF4F8A10),
    textDecorative2 = Color(0xFF1A7F7F),
    textDecorative3 = Color(0xFF9C27B0),
    textDecorative4 = Color(0xFF6A1B9A),
    textDecorative5 = Color(0xFFC2185B),
    textDecorative6 = Color(0xFFE65100),
    textDisabled = WaLight.disabled,
    textInfoPrimary = WaLight.blueInfo,
    textLinkExternal = WaLight.link,
    textOnSolidPrimary = Color.White,
    textPrimary = WaLight.textPrimary,
    textSecondary = WaLight.textSecondary,
    textSuccessPrimary = WaLight.teal,
    isLight = true,
)

// ── Dark WhatsApp SemanticColors ────────────────────────────────────
val whatsAppColorsDark = SemanticColors(
    bgAccentHovered = WaDark.teal,
    bgAccentPressed = WaDark.tealDark,
    bgAccentRest = WaDark.teal,
    bgAccentSelected = WaDark.tealDark,
    bgActionPrimaryDisabled = WaDark.disabled,
    bgActionPrimaryHovered = WaDark.teal,
    bgActionPrimaryPressed = WaDark.tealDark,
    bgActionPrimaryRest = WaDark.teal,
    bgActionSecondaryHovered = WaDark.gray300,
    bgActionSecondaryPressed = WaDark.gray400,
    bgActionSecondaryRest = WaDark.bg,
    bgActionTertiaryHovered = WaDark.gray300,
    bgActionTertiaryRest = WaDark.bg,
    bgActionTertiarySelected = WaDark.gray400,
    bgBadgeAccent = WaDark.tealLight,
    bgBadgeCritical = WaDark.red,
    bgBadgeDefault = WaDark.bg,
    bgBadgeInfo = WaDark.blueInfo,
    bgBadgePrimary = WaDark.gray900,
    bgBadgeSecondary = WaDark.gray500,
    bgCanvasDefault = WaDark.bg,
    bgCanvasDefaultLevel1 = WaDark.surface,
    bgCanvasDisabled = WaDark.gray200,
    bgCriticalHovered = WaDark.red,
    bgCriticalPrimary = WaDark.red,
    bgCriticalSubtle = WaDark.redSubtle,
    bgCriticalSubtleHovered = WaDark.redSubtle,
    bgDecorative1 = Color(0xFF2A3D1A),
    bgDecorative2 = Color(0xFF1A3D3D),
    bgDecorative3 = Color(0xFF3D1A33),
    bgDecorative4 = Color(0xFF2D1A3D),
    bgDecorative5 = Color(0xFF3D1A24),
    bgDecorative6 = Color(0xFF3D2A1A),
    bgInfoSubtle = WaDark.blueInfoSubtle,
    bgSubtlePrimary = WaDark.gray400,
    bgSubtleSecondary = WaDark.gray300,
    bgSubtleSecondaryLevel0 = WaDark.bg,
    bgSuccessSubtle = WaDark.tealDark,
    borderAccentPrimary = WaDark.teal,
    borderAccentSubtle = WaDark.teal.copy(alpha = 0.5f),
    borderCriticalHovered = WaDark.red,
    borderCriticalPrimary = WaDark.red,
    borderCriticalSubtle = WaDark.red.copy(alpha = 0.4f),
    borderDisabled = WaDark.gray500,
    borderFocused = WaDark.teal,
    borderInfoSubtle = WaDark.blueInfo.copy(alpha = 0.4f),
    borderInteractiveHovered = WaDark.gray800,
    borderInteractivePrimary = WaDark.gray600,
    borderInteractiveSecondary = WaDark.gray500,
    borderSuccessSubtle = WaDark.teal.copy(alpha = 0.4f),
    gradientActionStop1 = WaDark.tealDark,
    gradientActionStop2 = WaDark.teal,
    gradientActionStop3 = WaDark.teal,
    gradientActionStop4 = WaDark.tealLight,
    gradientCriticalStop1 = WaDark.redSubtle,
    gradientCriticalStop2 = WaDark.bg,
    gradientInfoStop1 = WaDark.blueInfoSubtle,
    gradientInfoStop2 = WaDark.bg,
    gradientSubtleStop1 = WaDark.teal.copy(alpha = 0.16f),
    gradientSubtleStop2 = WaDark.teal.copy(alpha = 0.12f),
    gradientSubtleStop3 = WaDark.teal.copy(alpha = 0.08f),
    gradientSubtleStop4 = WaDark.teal.copy(alpha = 0.04f),
    gradientSubtleStop5 = WaDark.teal.copy(alpha = 0.02f),
    gradientSubtleStop6 = Color.Transparent,
    iconAccentPrimary = WaDark.teal,
    iconAccentTertiary = WaDark.teal,
    iconCriticalPrimary = WaDark.red,
    iconDisabled = WaDark.disabled,
    iconInfoPrimary = WaDark.blueInfo,
    iconOnSolidPrimary = WaDark.bg,
    iconPrimary = WaDark.gray800,
    iconPrimaryAlpha = WaDark.gray800.copy(alpha = 0.9f),
    iconQuaternary = WaDark.gray600,
    iconQuaternaryAlpha = WaDark.gray600.copy(alpha = 0.5f),
    iconSecondary = WaDark.gray700,
    iconSecondaryAlpha = WaDark.gray700.copy(alpha = 0.7f),
    iconSuccessPrimary = WaDark.teal,
    iconTertiary = WaDark.gray600,
    iconTertiaryAlpha = WaDark.gray600.copy(alpha = 0.6f),
    separatorPrimary = WaDark.separator,
    textActionAccent = WaDark.teal,
    textActionPrimary = WaDark.gray900,
    textBadgeAccent = WaDark.tealLight,
    textBadgeInfo = WaDark.blueInfo,
    textCriticalPrimary = WaDark.red,
    textDecorative1 = Color(0xFF8BC34A),
    textDecorative2 = Color(0xFF4DD0E1),
    textDecorative3 = Color(0xFFCE93D8),
    textDecorative4 = Color(0xFFB39DDB),
    textDecorative5 = Color(0xFFF48FB1),
    textDecorative6 = Color(0xFFFFB74D),
    textDisabled = WaDark.disabled,
    textInfoPrimary = WaDark.blueInfo,
    textLinkExternal = WaDark.link,
    textOnSolidPrimary = Color.White,
    textPrimary = WaDark.textPrimary,
    textSecondary = WaDark.textSecondary,
    textSuccessPrimary = WaDark.teal,
    isLight = false,
)
