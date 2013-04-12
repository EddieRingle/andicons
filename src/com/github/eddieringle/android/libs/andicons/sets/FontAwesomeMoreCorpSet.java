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

public class FontAwesomeMoreCorpSet {

    public static final String FONTAWESOME_MORE_CORP_FONT = "fontawesome_more_corp.ttf";

    public static final int IC_AMAZON_SIGN = 0xf340;

    public static final int IC_AMAZON = 0xf341;

    public static final int IC_ANDROID = 0xf342;

    public static final int IC_APPLE_ITUNES = 0xf343;

    public static final int IC_APPLE = 0xf344;

    public static final int IC_AWS = 0xf345;

    public static final int IC_BING_SIGN = 0xf346;

    public static final int IC_BING = 0xf347;

    public static final int IC_DUCK_DUCK_GO = 0xf348;

    public static final int IC_GOOGLE_SIGN = 0xf349;

    public static final int IC_GOOGLE = 0xf34a;

    public static final int IC_SPARROW_SIGN = 0xf34b;

    public static final int IC_SPARROW = 0xf34c;

    public static final int IC_WINDOWS = 0xf34d;

    public static final int IC_WINDOWS8 = 0xf34e;

    public static final int IC_YAHOO = 0xf34f;

    public static Typeface getTypeface(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FONTAWESOME_MORE_CORP_FONT);
    }
}
