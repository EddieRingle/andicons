/*
 * Copyright (c) 2013 Eddie Ringle
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

import android.content.Context;
import android.graphics.Typeface;

public class FontAwesomeMoreExtSet {

    public static final String FONTAWESOME_MORE_EXT_FONT = "fontawesome_more_ext.ttf";

    public static final int IC_ACCESSIBILITY_SIGN = 0xf200;

    public static final int IC_BIKE_SIGN = 0xf201;

    public static final int IC_BUS_SIGN = 0xf202;

    public static final int IC_CAR_SIGN = 0xf203;

    public static final int IC_TAXI_SIGN = 0xf204;

    public static final int IC_TRUCK_SIGN = 0xf205;

    public static final int IC_ADOBE_PDF = 0xf206;

    public static final int IC_MS_EXCEL = 0xf207;

    public static final int IC_MS_PPT = 0xf208;

    public static final int IC_MS_WORD = 0xf209;

    public static final int IC_ZIP_FILE = 0xf20a;

    public static final int IC_CSS3 = 0xf20b;

    public static final int IC_HTML5 = 0xf20c;

    public static final int IC_LAYERS = 0xf20d;

    public static final int IC_MAP = 0xf20e;

    public static final int IC_CHROME = 0xf210;

    public static final int IC_FIREFOX = 0xf211;

    public static final int IC_IE = 0xf212;

    public static final int IC_OPERA = 0xf213;

    public static final int IC_SAFARI = 0xf214;

    public static final int IC_RSS_SIGN = 0xf215;

    public static Typeface getTypeface(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FONTAWESOME_MORE_EXT_FONT);
    }
}
