/*
 * Copyright (c) 2012 Eddie Ringle
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 * and the following disclaimer in the documentation and/or other materials provided with the
 * distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.github.eddieringle.android.libs.andicons.sets;

import com.github.eddieringle.android.libs.andicons.AndiconView;
import com.github.eddieringle.android.libs.andicons.R;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class FontAwesomeView extends AndiconView {

    private static final String FONTAWESOME_FONT = "fontawesome.ttf";

    public static final int IC_GLASS = 0xf000;

    public static final int IC_MUSIC = 0xf001;

    public static final int IC_SEARCH = 0xf002;

    public static final int IC_ENVELOPE = 0xf003;

    public static final int IC_HEART = 0xf004;

    public static final int IC_STAR = 0xf005;

    public static final int IC_STAR_EMPTY = 0xf006;

    public static final int IC_USER = 0xf007;

    public static final int IC_FILM = 0xf008;

    public static final int IC_TH_LARGE = 0xf009;

    public static final int IC_TH = 0xf00a;

    public static final int IC_TH_LIST = 0xf00b;

    public static final int IC_OK = 0xf00c;

    public static final int IC_REMOVE = 0xf00d;

    public static final int IC_ZOOM_IN = 0xf00e;

    public static final int IC_ZOOM_OUT = 0xf010;

    public static final int IC_OFF = 0xf011;

    public static final int IC_SIGNAL = 0xf012;

    public static final int IC_COG = 0xf013;

    public static final int IC_TRASH = 0xf014;

    public static final int IC_HOME = 0xf015;

    public static final int IC_FILE = 0xf016;

    public static final int IC_TIME = 0xf017;

    public static final int IC_ROAD = 0xf018;

    public static final int IC_DOWNLOAD_ALT = 0xf019;

    public static final int IC_DOWNLOAD = 0xf01a;

    public static final int IC_UPLOAD = 0xf01b;

    public static final int IC_INBOX = 0xf01c;

    public static final int IC_PLAY_CIRCLE = 0xf01d;

    public static final int IC_REPEAT = 0xf01e;

    public static final int IC_REFRESH = 0xf021;

    public static final int IC_LIST_ALT = 0xf022;

    public static final int IC_LOCK = 0xf023;

    public static final int IC_FLAG = 0xf024;

    public static final int IC_HEADPHONES = 0xf025;

    public static final int IC_VOLUME_OFF = 0xf026;

    public static final int IC_VOLUME_DOWN = 0xf027;

    public static final int IC_VOLUME_UP = 0xf028;

    public static final int IC_QRCODE = 0xf029;

    public static final int IC_BARCODE = 0xf02a;

    public static final int IC_TAG = 0xf02b;

    public static final int IC_TAGS = 0xf02c;

    public static final int IC_BOOK = 0xf02d;

    public static final int IC_BOOKMARK = 0xf02e;

    public static final int IC_PRINT = 0xf02f;

    public static final int IC_CAMERA = 0xf030;

    public static final int IC_FONT = 0xf031;

    public static final int IC_BOLD = 0xf032;

    public static final int IC_ITALIC = 0xf033;

    public static final int IC_TEXT_HEIGHT = 0xf034;

    public static final int IC_TEXT_WIDTH = 0xf035;

    public static final int IC_ALIGN_LEFT = 0xf036;

    public static final int IC_ALIGN_CENTER = 0xf037;

    public static final int IC_ALIGN_RIGHT = 0xf038;

    public static final int IC_ALIGN_JUSTIFY = 0xf039;

    public static final int IC_LIST = 0xf03a;

    public static final int IC_INDENT_LEFT = 0xf03b;

    public static final int IC_INDENT_RIGHT = 0xf03c;

    public static final int IC_FACETIME_VIDEO = 0xf03d;

    public static final int IC_PICTURE = 0xf03e;

    public static final int IC_PENCIL = 0xf040;

    public static final int IC_MAP_MARKER = 0xf041;

    public static final int IC_ADJUST = 0xf042;

    public static final int IC_TINT = 0xf043;

    public static final int IC_EDIT = 0xf044;

    public static final int IC_SHARE = 0xf045;

    public static final int IC_CHECK = 0xf046;

    public static final int IC_MOVE = 0xf047;

    public static final int IC_STEP_BACKWARD = 0xf048;

    public static final int IC_FAST_BACKWARD = 0xf049;

    public static final int IC_BACKWARD = 0xf04a;

    public static final int IC_PLAY = 0xf04b;

    public static final int IC_PAUSE = 0xf04c;

    public static final int IC_STOP = 0xf04d;

    public static final int IC_FORWARD = 0xf04e;

    public static final int IC_FAST_FORWARD = 0xf050;

    public static final int IC_STEP_FORWARD = 0xf051;

    public static final int IC_EJECT = 0xf052;

    public static final int IC_CHEVRON_LEFT = 0xf053;

    public static final int IC_CHEVRON_RIGHT = 0xf054;

    public static final int IC_PLUS_SIGN = 0xf055;

    public static final int IC_MINUS_SIGN = 0xf056;

    public static final int IC_REMOVE_SIGN = 0xf057;

    public static final int IC_OK_SIGN = 0xf058;

    public static final int IC_QUESTION_SIGN = 0xf059;

    public static final int IC_INFO_SIGN = 0xf05a;

    public static final int IC_SCREENSHOT = 0xf05b;

    public static final int IC_REMOVE_CIRCLE = 0xf05c;

    public static final int IC_OK_CIRCLE = 0xf05d;

    public static final int IC_BAN_CIRCLE = 0xf05e;

    public static final int IC_ARROW_LEFT = 0xf060;

    public static final int IC_ARROW_RIGHT = 0xf061;

    public static final int IC_ARROW_UP = 0xf062;

    public static final int IC_ARROW_DOWN = 0xf063;

    public static final int IC_SHARE_ALT = 0xf064;

    public static final int IC_RESIZE_FULL = 0xf065;

    public static final int IC_RESIZE_SMALL = 0xf066;

    public static final int IC_PLUS = 0xf067;

    public static final int IC_MINUS = 0xf068;

    public static final int IC_ASTERISK = 0xf069;

    public static final int IC_EXCLAMATION_SIGN = 0xf06a;

    public static final int IC_GIFT = 0xf06b;

    public static final int IC_LEAF = 0xf06c;

    public static final int IC_FIRE = 0xf06d;

    public static final int IC_EYE_OPEN = 0xf06e;

    public static final int IC_EYE_CLOSE = 0xf070;

    public static final int IC_WARNING_SIGN = 0xf071;

    public static final int IC_PLANE = 0xf072;

    public static final int IC_CALENDAR = 0xf073;

    public static final int IC_RANDOM = 0xf074;

    public static final int IC_COMMENT = 0xf075;

    public static final int IC_MAGNET = 0xf076;

    public static final int IC_CHEVRON_UP = 0xf077;

    public static final int IC_CHEVRON_DOWN = 0xf078;

    public static final int IC_RETWEET = 0xf079;

    public static final int IC_SHOPPING_CART = 0xf07a;

    public static final int IC_FOLDER_CLOSE = 0xf07b;

    public static final int IC_FOLDER_OPEN = 0xf07c;

    public static final int IC_RESIZE_VERTICAL = 0xf07d;

    public static final int IC_RESIZE_HORIZONTAL = 0xf07e;

    public static final int IC_BAR_CHART = 0xf080;

    public static final int IC_TWITTER_SIGN = 0xf081;

    public static final int IC_FACEBOOK_SIGN = 0xf082;

    public static final int IC_CAMERA_RETRO = 0xf083;

    public static final int IC_KEY = 0xf084;

    public static final int IC_COGS = 0xf085;

    public static final int IC_COMMENTS = 0xf086;

    public static final int IC_THUMBS_UP = 0xf087;

    public static final int IC_THUMBS_DOWN = 0xf088;

    public static final int IC_STAR_HALF = 0xf089;

    public static final int IC_HEART_EMPTY = 0xf08a;

    public static final int IC_SIGNOUT = 0xf08b;

    public static final int IC_LINKEDIN_SIGN = 0xf08c;

    public static final int IC_PUSHPIN = 0xf08d;

    public static final int IC_EXTERNAL_LINK = 0xf08e;

    public static final int IC_SIGNIN = 0xf090;

    public static final int IC_TROPHY = 0xf091;

    public static final int IC_GITHUB_SIGN = 0xf092;

    public static final int IC_UPLOAD_ALT = 0xf093;

    public static final int IC_LEMON = 0xf094;

    public static final int IC_PHONE = 0xf095;

    public static final int IC_CHECK_EMPTY = 0xf096;

    public static final int IC_BOOKMARK_EMPTY = 0xf097;

    public static final int IC_PHONE_SIGN = 0xf098;

    public static final int IC_TWITTER = 0xf099;

    public static final int IC_FACEBOOK = 0xf09a;

    public static final int IC_GITHUB = 0xf09b;

    public static final int IC_UNLOCK = 0xf09c;

    public static final int IC_CREDIT_CARD = 0xf09d;

    public static final int IC_RSS = 0xf09e;

    public static final int IC_HDD = 0xf0a0;

    public static final int IC_BULLHORN = 0xf0a1;

    public static final int IC_BELL = 0xf0a2;

    public static final int IC_CERTIFICATE = 0xf0a3;

    public static final int IC_HAND_RIGHT = 0xf0a4;

    public static final int IC_HAND_LEFT = 0xf0a5;

    public static final int IC_HAND_UP = 0xf0a6;

    public static final int IC_HAND_DOWN = 0xf0a7;

    public static final int IC_CIRCLE_ARROW_LEFT = 0xf0a8;

    public static final int IC_CIRCLE_ARROW_RIGHT = 0xf0a9;

    public static final int IC_CIRCLE_ARROW_UP = 0xf0aa;

    public static final int IC_CIRCLE_ARROW_DOWN = 0xf0ab;

    public static final int IC_GLOBE = 0xf0ac;

    public static final int IC_WRENCH = 0xf0ad;

    public static final int IC_TASKS = 0xf0ae;

    public static final int IC_FILTER = 0xf0b0;

    public static final int IC_BRIEFCASE = 0xf0b1;

    public static final int IC_FULLSCREEN = 0xf0b2;

    public static final int IC_GROUP = 0xf0c0;

    public static final int IC_LINK = 0xf0c1;

    public static final int IC_CLOUD = 0xf0c2;

    public static final int IC_BEAKER = 0xf0c3;

    public static final int IC_CUT = 0xf0c4;

    public static final int IC_COPY = 0xf0c5;

    public static final int IC_PAPER_CLIP = 0xf0c6;

    public static final int IC_SAVE = 0xf0c7;

    public static final int IC_SIGN_BLANK = 0xf0c8;

    public static final int IC_REORDER = 0xf0c9;

    public static final int IC_LIST_UL = 0xf0ca;

    public static final int IC_LIST_OL = 0xf0cb;

    public static final int IC_STRIKETHROUGH = 0xf0cc;

    public static final int IC_UNDERLINE = 0xf0cd;

    public static final int IC_TABLE = 0xf0ce;

    public static final int IC_MAGIC = 0xf0d0;

    public static final int IC_TRUCK = 0xf0d1;

    public static final int IC_PINTEREST = 0xf0d2;

    public static final int IC_PINTEREST_SIGN = 0xf0d3;

    public static final int IC_GOOGLE_PLUS_SIGN = 0xf0d4;

    public static final int IC_GOOGLE_PLUS = 0xf0d5;

    public static final int IC_MONEY = 0xf0d6;

    public static final int IC_CARET_DOWN = 0xf0d7;

    public static final int IC_CARET_UP = 0xf0d8;

    public static final int IC_CARET_LEFT = 0xf0d9;

    public static final int IC_CARET_RIGHT = 0xf0da;

    public static final int IC_COLUMNS = 0xf0db;

    public static final int IC_SORT = 0xf0dc;

    public static final int IC_SORT_DOWN = 0xf0dd;

    public static final int IC_SORT_UP = 0xf0de;

    public static final int IC_ENVELOPE_ALT = 0xf0e0;

    public static final int IC_LINKEDIN = 0xf0e1;

    public static final int IC_UNDO = 0xf0e2;

    public static final int IC_LEGAL = 0xf0e3;

    public static final int IC_DASHBOARD = 0xf0e4;

    public static final int IC_COMMENT_ALT = 0xf0e5;

    public static final int IC_COMMENTS_ALT = 0xf0e6;

    public static final int IC_BOLT = 0xf0e7;

    public static final int IC_SITEMAP = 0xf0e8;

    public static final int IC_UMBRELLA = 0xf0e9;

    public static final int IC_PASTE = 0xf0ea;

    public static final int IC_USER_MD = 0xf200;

    public FontAwesomeView(Context context) {
        super(context);
    }

    public FontAwesomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FontAwesomeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAndiconById(final int id) {
        if (id == R.id.fontawesome_adjust) {
            setAndicon(IC_ADJUST);
        } else if (id == R.id.fontawesome_align_center) {
            setAndicon(IC_ALIGN_CENTER);
        } else if (id == R.id.fontawesome_align_justify) {
            setAndicon(IC_ALIGN_JUSTIFY);
        } else if (id == R.id.fontawesome_align_left) {
            setAndicon(IC_ALIGN_LEFT);
        } else if (id == R.id.fontawesome_align_right) {
            setAndicon(IC_ALIGN_RIGHT);
        } else if (id == R.id.fontawesome_arrow_down) {
            setAndicon(IC_ARROW_DOWN);
        } else if (id == R.id.fontawesome_arrow_left) {
            setAndicon(IC_ARROW_LEFT);
        } else if (id == R.id.fontawesome_arrow_right) {
            setAndicon(IC_ARROW_RIGHT);
        } else if (id == R.id.fontawesome_arrow_up) {
            setAndicon(IC_ARROW_UP);
        } else if (id == R.id.fontawesome_asterisk) {
            setAndicon(IC_ASTERISK);
        } else if (id == R.id.fontawesome_backward) {
            setAndicon(IC_BACKWARD);
        } else if (id == R.id.fontawesome_ban_circle) {
            setAndicon(IC_BAN_CIRCLE);
        } else if (id == R.id.fontawesome_bar_chart) {
            setAndicon(IC_BAR_CHART);
        } else if (id == R.id.fontawesome_barcode) {
            setAndicon(IC_BARCODE);
        } else if (id == R.id.fontawesome_beaker) {
            setAndicon(IC_BEAKER);
        } else if (id == R.id.fontawesome_bell) {
            setAndicon(IC_BELL);
        } else if (id == R.id.fontawesome_bold) {
            setAndicon(IC_BOLD);
        } else if (id == R.id.fontawesome_bolt) {
            setAndicon(IC_BOLT);
        } else if (id == R.id.fontawesome_book) {
            setAndicon(IC_BOOK);
        } else if (id == R.id.fontawesome_bookmark_empty) {
            setAndicon(IC_BOOKMARK_EMPTY);
        } else if (id == R.id.fontawesome_bookmark) {
            setAndicon(IC_BOOKMARK);
        } else if (id == R.id.fontawesome_briefcase) {
            setAndicon(IC_BRIEFCASE);
        } else if (id == R.id.fontawesome_bullhorn) {
            setAndicon(IC_BULLHORN);
        } else if (id == R.id.fontawesome_calendar) {
            setAndicon(IC_CALENDAR);
        } else if (id == R.id.fontawesome_camera_retro) {
            setAndicon(IC_CAMERA_RETRO);
        } else if (id == R.id.fontawesome_camera) {
            setAndicon(IC_CAMERA);
        } else if (id == R.id.fontawesome_caret_down) {
            setAndicon(IC_CARET_DOWN);
        } else if (id == R.id.fontawesome_caret_left) {
            setAndicon(IC_CARET_LEFT);
        } else if (id == R.id.fontawesome_caret_right) {
            setAndicon(IC_CARET_RIGHT);
        } else if (id == R.id.fontawesome_caret_up) {
            setAndicon(IC_CARET_UP);
        } else if (id == R.id.fontawesome_certificate) {
            setAndicon(IC_CERTIFICATE);
        } else if (id == R.id.fontawesome_check_empty) {
            setAndicon(IC_CHECK_EMPTY);
        } else if (id == R.id.fontawesome_check) {
            setAndicon(IC_CHECK);
        } else if (id == R.id.fontawesome_chevron_down) {
            setAndicon(IC_CHEVRON_DOWN);
        } else if (id == R.id.fontawesome_chevron_left) {
            setAndicon(IC_CHEVRON_LEFT);
        } else if (id == R.id.fontawesome_chevron_right) {
            setAndicon(IC_CHEVRON_RIGHT);
        } else if (id == R.id.fontawesome_chevron_up) {
            setAndicon(IC_CHEVRON_UP);
        } else if (id == R.id.fontawesome_circle_arrow_down) {
            setAndicon(IC_CIRCLE_ARROW_DOWN);
        } else if (id == R.id.fontawesome_circle_arrow_left) {
            setAndicon(IC_CIRCLE_ARROW_LEFT);
        } else if (id == R.id.fontawesome_circle_arrow_right) {
            setAndicon(IC_CIRCLE_ARROW_RIGHT);
        } else if (id == R.id.fontawesome_circle_arrow_up) {
            setAndicon(IC_CIRCLE_ARROW_UP);
        } else if (id == R.id.fontawesome_cloud) {
            setAndicon(IC_CLOUD);
        } else if (id == R.id.fontawesome_cog) {
            setAndicon(IC_COG);
        } else if (id == R.id.fontawesome_cogs) {
            setAndicon(IC_COGS);
        } else if (id == R.id.fontawesome_columns) {
            setAndicon(IC_COLUMNS);
        } else if (id == R.id.fontawesome_comment_alt) {
            setAndicon(IC_COMMENT_ALT);
        } else if (id == R.id.fontawesome_comment) {
            setAndicon(IC_COMMENT);
        } else if (id == R.id.fontawesome_comments_alt) {
            setAndicon(IC_COMMENTS_ALT);
        } else if (id == R.id.fontawesome_comments) {
            setAndicon(IC_COMMENTS);
        } else if (id == R.id.fontawesome_copy) {
            setAndicon(IC_COPY);
        } else if (id == R.id.fontawesome_credit_card) {
            setAndicon(IC_CREDIT_CARD);
        } else if (id == R.id.fontawesome_cut) {
            setAndicon(IC_CUT);
        } else if (id == R.id.fontawesome_dashboard) {
            setAndicon(IC_DASHBOARD);
        } else if (id == R.id.fontawesome_download_alt) {
            setAndicon(IC_DOWNLOAD_ALT);
        } else if (id == R.id.fontawesome_download) {
            setAndicon(IC_DOWNLOAD);
        } else if (id == R.id.fontawesome_edit) {
            setAndicon(IC_EDIT);
        } else if (id == R.id.fontawesome_eject) {
            setAndicon(IC_EJECT);
        } else if (id == R.id.fontawesome_envelope_alt) {
            setAndicon(IC_ENVELOPE_ALT);
        } else if (id == R.id.fontawesome_envelope) {
            setAndicon(IC_ENVELOPE);
        } else if (id == R.id.fontawesome_exclamation_sign) {
            setAndicon(IC_EXCLAMATION_SIGN);
        } else if (id == R.id.fontawesome_external_link) {
            setAndicon(IC_EXTERNAL_LINK);
        } else if (id == R.id.fontawesome_eye_close) {
            setAndicon(IC_EYE_CLOSE);
        } else if (id == R.id.fontawesome_eye_open) {
            setAndicon(IC_EYE_OPEN);
        } else if (id == R.id.fontawesome_facebook_sign) {
            setAndicon(IC_FACEBOOK_SIGN);
        } else if (id == R.id.fontawesome_facebook) {
            setAndicon(IC_FACEBOOK);
        } else if (id == R.id.fontawesome_facetime_video) {
            setAndicon(IC_FACETIME_VIDEO);
        } else if (id == R.id.fontawesome_fast_backward) {
            setAndicon(IC_FAST_BACKWARD);
        } else if (id == R.id.fontawesome_fast_forward) {
            setAndicon(IC_FAST_FORWARD);
        } else if (id == R.id.fontawesome_file) {
            setAndicon(IC_FILE);
        } else if (id == R.id.fontawesome_film) {
            setAndicon(IC_FILM);
        } else if (id == R.id.fontawesome_filter) {
            setAndicon(IC_FILTER);
        } else if (id == R.id.fontawesome_fire) {
            setAndicon(IC_FIRE);
        } else if (id == R.id.fontawesome_flag) {
            setAndicon(IC_FLAG);
        } else if (id == R.id.fontawesome_folder_close) {
            setAndicon(IC_FOLDER_CLOSE);
        } else if (id == R.id.fontawesome_folder_open) {
            setAndicon(IC_FOLDER_OPEN);
        } else if (id == R.id.fontawesome_font) {
            setAndicon(IC_FONT);
        } else if (id == R.id.fontawesome_forward) {
            setAndicon(IC_FORWARD);
        } else if (id == R.id.fontawesome_fullscreen) {
            setAndicon(IC_FULLSCREEN);
        } else if (id == R.id.fontawesome_gift) {
            setAndicon(IC_GIFT);
        } else if (id == R.id.fontawesome_github_sign) {
            setAndicon(IC_GITHUB_SIGN);
        } else if (id == R.id.fontawesome_github) {
            setAndicon(IC_GITHUB);
        } else if (id == R.id.fontawesome_glass) {
            setAndicon(IC_GLASS);
        } else if (id == R.id.fontawesome_globe) {
            setAndicon(IC_GLOBE);
        } else if (id == R.id.fontawesome_google_plus_sign) {
            setAndicon(IC_GOOGLE_PLUS_SIGN);
        } else if (id == R.id.fontawesome_google_plus) {
            setAndicon(IC_GOOGLE_PLUS);
        } else if (id == R.id.fontawesome_group) {
            setAndicon(IC_GROUP);
        } else if (id == R.id.fontawesome_hand_down) {
            setAndicon(IC_HAND_DOWN);
        } else if (id == R.id.fontawesome_hand_left) {
            setAndicon(IC_HAND_LEFT);
        } else if (id == R.id.fontawesome_hand_right) {
            setAndicon(IC_HAND_RIGHT);
        } else if (id == R.id.fontawesome_hand_up) {
            setAndicon(IC_HAND_UP);
        } else if (id == R.id.fontawesome_hdd) {
            setAndicon(IC_HDD);
        } else if (id == R.id.fontawesome_headphones) {
            setAndicon(IC_HEADPHONES);
        } else if (id == R.id.fontawesome_heart_empty) {
            setAndicon(IC_HEART_EMPTY);
        } else if (id == R.id.fontawesome_heart) {
            setAndicon(IC_HEART);
        } else if (id == R.id.fontawesome_home) {
            setAndicon(IC_HOME);
        } else if (id == R.id.fontawesome_inbox) {
            setAndicon(IC_INBOX);
        } else if (id == R.id.fontawesome_indent_left) {
            setAndicon(IC_INDENT_LEFT);
        } else if (id == R.id.fontawesome_indent_right) {
            setAndicon(IC_INDENT_RIGHT);
        } else if (id == R.id.fontawesome_info_sign) {
            setAndicon(IC_INFO_SIGN);
        } else if (id == R.id.fontawesome_italic) {
            setAndicon(IC_ITALIC);
        } else if (id == R.id.fontawesome_key) {
            setAndicon(IC_KEY);
        } else if (id == R.id.fontawesome_leaf) {
            setAndicon(IC_LEAF);
        } else if (id == R.id.fontawesome_legal) {
            setAndicon(IC_LEGAL);
        } else if (id == R.id.fontawesome_lemon) {
            setAndicon(IC_LEMON);
        } else if (id == R.id.fontawesome_link) {
            setAndicon(IC_LINK);
        } else if (id == R.id.fontawesome_linkedin_sign) {
            setAndicon(IC_LINKEDIN_SIGN);
        } else if (id == R.id.fontawesome_linkedin) {
            setAndicon(IC_LINKEDIN);
        } else if (id == R.id.fontawesome_list_alt) {
            setAndicon(IC_LIST_ALT);
        } else if (id == R.id.fontawesome_list_ol) {
            setAndicon(IC_LIST_OL);
        } else if (id == R.id.fontawesome_list_ul) {
            setAndicon(IC_LIST_UL);
        } else if (id == R.id.fontawesome_list) {
            setAndicon(IC_LIST);
        } else if (id == R.id.fontawesome_lock) {
            setAndicon(IC_LOCK);
        } else if (id == R.id.fontawesome_magic) {
            setAndicon(IC_MAGIC);
        } else if (id == R.id.fontawesome_magnet) {
            setAndicon(IC_MAGNET);
        } else if (id == R.id.fontawesome_map_marker) {
            setAndicon(IC_MAP_MARKER);
        } else if (id == R.id.fontawesome_minus_sign) {
            setAndicon(IC_MINUS_SIGN);
        } else if (id == R.id.fontawesome_minus) {
            setAndicon(IC_MINUS);
        } else if (id == R.id.fontawesome_money) {
            setAndicon(IC_MONEY);
        } else if (id == R.id.fontawesome_move) {
            setAndicon(IC_MOVE);
        } else if (id == R.id.fontawesome_music) {
            setAndicon(IC_MUSIC);
        } else if (id == R.id.fontawesome_off) {
            setAndicon(IC_OFF);
        } else if (id == R.id.fontawesome_ok_circle) {
            setAndicon(IC_OK_CIRCLE);
        } else if (id == R.id.fontawesome_ok_sign) {
            setAndicon(IC_OK_SIGN);
        } else if (id == R.id.fontawesome_ok) {
            setAndicon(IC_OK);
        } else if (id == R.id.fontawesome_paper_clip) {
            setAndicon(IC_PAPER_CLIP);
        } else if (id == R.id.fontawesome_paste) {
            setAndicon(IC_PASTE);
        } else if (id == R.id.fontawesome_pause) {
            setAndicon(IC_PAUSE);
        } else if (id == R.id.fontawesome_pencil) {
            setAndicon(IC_PENCIL);
        } else if (id == R.id.fontawesome_phone_sign) {
            setAndicon(IC_PHONE_SIGN);
        } else if (id == R.id.fontawesome_phone) {
            setAndicon(IC_PHONE);
        } else if (id == R.id.fontawesome_picture) {
            setAndicon(IC_PICTURE);
        } else if (id == R.id.fontawesome_pinterest_sign) {
            setAndicon(IC_PINTEREST_SIGN);
        } else if (id == R.id.fontawesome_pinterest) {
            setAndicon(IC_PINTEREST);
        } else if (id == R.id.fontawesome_plane) {
            setAndicon(IC_PLANE);
        } else if (id == R.id.fontawesome_play_circle) {
            setAndicon(IC_PLAY_CIRCLE);
        } else if (id == R.id.fontawesome_play) {
            setAndicon(IC_PLAY);
        } else if (id == R.id.fontawesome_plus_sign) {
            setAndicon(IC_PLUS_SIGN);
        } else if (id == R.id.fontawesome_plus) {
            setAndicon(IC_PLUS);
        } else if (id == R.id.fontawesome_print) {
            setAndicon(IC_PRINT);
        } else if (id == R.id.fontawesome_pushpin) {
            setAndicon(IC_PUSHPIN);
        } else if (id == R.id.fontawesome_qrcode) {
            setAndicon(IC_QRCODE);
        } else if (id == R.id.fontawesome_question_sign) {
            setAndicon(IC_QUESTION_SIGN);
        } else if (id == R.id.fontawesome_random) {
            setAndicon(IC_RANDOM);
        } else if (id == R.id.fontawesome_refresh) {
            setAndicon(IC_REFRESH);
        } else if (id == R.id.fontawesome_remove_circle) {
            setAndicon(IC_REMOVE_CIRCLE);
        } else if (id == R.id.fontawesome_remove_sign) {
            setAndicon(IC_REMOVE_SIGN);
        } else if (id == R.id.fontawesome_remove) {
            setAndicon(IC_REMOVE);
        } else if (id == R.id.fontawesome_reorder) {
            setAndicon(IC_REORDER);
        } else if (id == R.id.fontawesome_repeat) {
            setAndicon(IC_REPEAT);
        } else if (id == R.id.fontawesome_resize_full) {
            setAndicon(IC_RESIZE_FULL);
        } else if (id == R.id.fontawesome_resize_horizontal) {
            setAndicon(IC_RESIZE_HORIZONTAL);
        } else if (id == R.id.fontawesome_resize_small) {
            setAndicon(IC_RESIZE_SMALL);
        } else if (id == R.id.fontawesome_resize_vertical) {
            setAndicon(IC_RESIZE_VERTICAL);
        } else if (id == R.id.fontawesome_retweet) {
            setAndicon(IC_RETWEET);
        } else if (id == R.id.fontawesome_road) {
            setAndicon(IC_ROAD);
        } else if (id == R.id.fontawesome_rss) {
            setAndicon(IC_RSS);
        } else if (id == R.id.fontawesome_save) {
            setAndicon(IC_SAVE);
        } else if (id == R.id.fontawesome_screenshot) {
            setAndicon(IC_SCREENSHOT);
        } else if (id == R.id.fontawesome_search) {
            setAndicon(IC_SEARCH);
        } else if (id == R.id.fontawesome_share_alt) {
            setAndicon(IC_SHARE_ALT);
        } else if (id == R.id.fontawesome_share) {
            setAndicon(IC_SHARE);
        } else if (id == R.id.fontawesome_shopping_cart) {
            setAndicon(IC_SHOPPING_CART);
        } else if (id == R.id.fontawesome_sign_blank) {
            setAndicon(IC_SIGN_BLANK);
        } else if (id == R.id.fontawesome_signal) {
            setAndicon(IC_SIGNAL);
        } else if (id == R.id.fontawesome_signin) {
            setAndicon(IC_SIGNIN);
        } else if (id == R.id.fontawesome_signout) {
            setAndicon(IC_SIGNOUT);
        } else if (id == R.id.fontawesome_sitemap) {
            setAndicon(IC_SITEMAP);
        } else if (id == R.id.fontawesome_sort_down) {
            setAndicon(IC_SORT_DOWN);
        } else if (id == R.id.fontawesome_sort_up) {
            setAndicon(IC_SORT_UP);
        } else if (id == R.id.fontawesome_sort) {
            setAndicon(IC_SORT);
        } else if (id == R.id.fontawesome_star_empty) {
            setAndicon(IC_STAR_EMPTY);
        } else if (id == R.id.fontawesome_star_half) {
            setAndicon(IC_STAR_HALF);
        } else if (id == R.id.fontawesome_star) {
            setAndicon(IC_STAR);
        } else if (id == R.id.fontawesome_step_backward) {
            setAndicon(IC_STEP_BACKWARD);
        } else if (id == R.id.fontawesome_step_forward) {
            setAndicon(IC_STEP_FORWARD);
        } else if (id == R.id.fontawesome_stop) {
            setAndicon(IC_STOP);
        } else if (id == R.id.fontawesome_strikethrough) {
            setAndicon(IC_STRIKETHROUGH);
        } else if (id == R.id.fontawesome_table) {
            setAndicon(IC_TABLE);
        } else if (id == R.id.fontawesome_tag) {
            setAndicon(IC_TAG);
        } else if (id == R.id.fontawesome_tags) {
            setAndicon(IC_TAGS);
        } else if (id == R.id.fontawesome_tasks) {
            setAndicon(IC_TASKS);
        } else if (id == R.id.fontawesome_text_height) {
            setAndicon(IC_TEXT_HEIGHT);
        } else if (id == R.id.fontawesome_text_width) {
            setAndicon(IC_TEXT_WIDTH);
        } else if (id == R.id.fontawesome_th_large) {
            setAndicon(IC_TH_LARGE);
        } else if (id == R.id.fontawesome_th_list) {
            setAndicon(IC_TH_LIST);
        } else if (id == R.id.fontawesome_th) {
            setAndicon(IC_TH);
        } else if (id == R.id.fontawesome_thumbs_down) {
            setAndicon(IC_THUMBS_DOWN);
        } else if (id == R.id.fontawesome_thumbs_up) {
            setAndicon(IC_THUMBS_UP);
        } else if (id == R.id.fontawesome_time) {
            setAndicon(IC_TIME);
        } else if (id == R.id.fontawesome_tint) {
            setAndicon(IC_TINT);
        } else if (id == R.id.fontawesome_trash) {
            setAndicon(IC_TRASH);
        } else if (id == R.id.fontawesome_trophy) {
            setAndicon(IC_TROPHY);
        } else if (id == R.id.fontawesome_truck) {
            setAndicon(IC_TRUCK);
        } else if (id == R.id.fontawesome_twitter_sign) {
            setAndicon(IC_TWITTER_SIGN);
        } else if (id == R.id.fontawesome_twitter) {
            setAndicon(IC_TWITTER);
        } else if (id == R.id.fontawesome_umbrella) {
            setAndicon(IC_UMBRELLA);
        } else if (id == R.id.fontawesome_underline) {
            setAndicon(IC_UNDERLINE);
        } else if (id == R.id.fontawesome_undo) {
            setAndicon(IC_UNDO);
        } else if (id == R.id.fontawesome_unlock) {
            setAndicon(IC_UNLOCK);
        } else if (id == R.id.fontawesome_upload_alt) {
            setAndicon(IC_UPLOAD_ALT);
        } else if (id == R.id.fontawesome_upload) {
            setAndicon(IC_UPLOAD);
        } else if (id == R.id.fontawesome_user_md) {
            setAndicon(IC_USER_MD);
        } else if (id == R.id.fontawesome_user) {
            setAndicon(IC_USER);
        } else if (id == R.id.fontawesome_volume_down) {
            setAndicon(IC_VOLUME_DOWN);
        } else if (id == R.id.fontawesome_volume_off) {
            setAndicon(IC_VOLUME_OFF);
        } else if (id == R.id.fontawesome_volume_up) {
            setAndicon(IC_VOLUME_UP);
        } else if (id == R.id.fontawesome_warning_sign) {
            setAndicon(IC_WARNING_SIGN);
        } else if (id == R.id.fontawesome_wrench) {
            setAndicon(IC_WRENCH);
        } else if (id == R.id.fontawesome_zoom_in) {
            setAndicon(IC_ZOOM_IN);
        } else if (id == R.id.fontawesome_zoom_out) {
            setAndicon(IC_ZOOM_OUT);
        } else {
        }
    }

    @Override
    protected Typeface getTypeface() {
        return Typeface.createFromAsset(getContext().getAssets(), FONTAWESOME_FONT);
    }
}
