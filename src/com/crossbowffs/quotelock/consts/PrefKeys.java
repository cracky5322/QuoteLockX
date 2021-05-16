package com.crossbowffs.quotelock.consts;

import com.crossbowffs.quotelock.modules.hitokoto.HitokotoQuoteModule;
import com.crossbowffs.quotelock.modules.vnaas.VnaasQuoteModule;

public final class PrefKeys {
    public static final String PREF_COMMON = "common";
    public static final String PREF_COMMON_DISPLAY_ON_AOD = "pref_common_display_on_aod";
    public static final String PREF_COMMON_REFRESH_RATE = "pref_common_refresh_rate";
    public static final String PREF_COMMON_REFRESH_RATE_DEFAULT = "900";
    public static final String PREF_COMMON_UNMETERED_ONLY = "pref_common_unmetered_only";
    public static final boolean PREF_COMMON_UNMETERED_ONLY_DEFAULT = false;
    public static final String PREF_COMMON_QUOTE_MODULE = "pref_common_quote_module";
    public static final String PREF_COMMON_QUOTE_MODULE_DEFAULT = HitokotoQuoteModule.class.getName();
    public static final String PREF_COMMON_MODULE_PREFERENCES = "pref_module_preferences";
    public static final String PREF_COMMON_REQUIRES_INTERNET = "pref_common_requires_internet";
    public static final String PREF_COMMON_REFRESH_RATE_OVERRIDE = "pref_common_refresh_rate_override";
    public static final String PREF_COMMON_FONT_SIZE_TEXT = "pref_common_font_size_text";
    public static final String PREF_COMMON_FONT_SIZE_TEXT_DEFAULT = "20";
    public static final String PREF_COMMON_FONT_SIZE_SOURCE = "pref_common_font_size_source";
    public static final String PREF_COMMON_FONT_SIZE_SOURCE_DEFAULT = "18";
    public static final String PREF_COMMON_FONT_STYLE_TEXT = "pref_common_font_style_text";
    public static final String PREF_COMMON_FONT_STYLE_SOURCE = "pref_common_font_style_source";
    public static final String PREF_COMMON_UPDATE_INFO = "pref_common_update_info";
    public static final String PREF_COMMON_FONT_FAMILY = "pref_common_font_family";
    public static final String PREF_COMMON_FONT_FAMILY_DEFAULT = "system";
    public static final String PREF_COMMON_PADDING_TOP = "pref_common_padding_top";
    public static final String PREF_COMMON_PADDING_TOP_DEFAULT = "8";
    public static final String PREF_COMMON_PADDING_BOTTOM = "pref_common_padding_bottom";
    public static final String PREF_COMMON_PADDING_BOTTOM_DEFAULT = "8";

    public static final String PREF_QUOTES = "quotes";
    public static final String PREF_QUOTES_TEXT = "pref_quotes_text";
    public static final String PREF_QUOTES_SOURCE = "pref_quotes_source";
    public static final String PREF_QUOTES_COLLECTION_STATE = "pref_quotes_collection_state";
    public static final String PREF_QUOTES_LAST_UPDATED = "pref_quotes_last_updated";

    public static final String PREF_FEATURES_COLLECTION = "pref_collection";

    public static final String PREF_ABOUT_CREDITS = "pref_about_credits";
    public static final String PREF_ABOUT_GITHUB = "pref_about_github";
    public static final String PREF_ABOUT_GITHUB_CURRENT = "pref_about_github_current";
    public static final String PREF_ABOUT_VERSION = "pref_about_version";

    public static final String PREF_BOOT_NOTIFY_FLAG = "boot_notify_flag";

    private PrefKeys() { }
}
