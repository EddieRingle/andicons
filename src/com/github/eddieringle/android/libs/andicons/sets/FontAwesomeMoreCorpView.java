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

import com.github.eddieringle.android.libs.andicons.AndiconView;
import com.github.eddieringle.android.libs.andicons.R;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class FontAwesomeMoreCorpView extends AndiconView {

    private static final String FONTAWESOME_MORE_CORP_FONT = "fontawesome_more_corp.ttf";

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

    public FontAwesomeMoreCorpView(Context context) {
        super(context);
    }

    public FontAwesomeMoreCorpView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FontAwesomeMoreCorpView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAndiconById(final int id) {
        if (id == R.id.fontawesome_more_amazon) {
            setAndicon(IC_AMAZON);
        } else if (id == R.id.fontawesome_more_amazon_sign) {
            setAndicon(IC_AMAZON_SIGN);
        } else if (id == R.id.fontawesome_more_android) {
            setAndicon(IC_ANDROID);
        } else if (id == R.id.fontawesome_more_apple) {
            setAndicon(IC_APPLE);
        } else if (id == R.id.fontawesome_more_apple_itunes) {
            setAndicon(IC_APPLE_ITUNES);
        } else if (id == R.id.fontawesome_more_aws) {
            setAndicon(IC_AWS);
        } else if (id == R.id.fontawesome_more_bing) {
            setAndicon(IC_BING);
        } else if (id == R.id.fontawesome_more_bing_sign) {
            setAndicon(IC_BING_SIGN);
        } else if (id == R.id.fontawesome_more_duck_duck_go) {
            setAndicon(IC_DUCK_DUCK_GO);
        } else if (id == R.id.fontawesome_more_google) {
            setAndicon(IC_GOOGLE);
        } else if (id == R.id.fontawesome_more_google_sign) {
            setAndicon(IC_GOOGLE_SIGN);
        } else if (id == R.id.fontawesome_more_sparrow) {
            setAndicon(IC_SPARROW);
        } else if (id == R.id.fontawesome_more_sparrow_sign) {
            setAndicon(IC_SPARROW_SIGN);
        } else if (id == R.id.fontawesome_more_windows) {
            setAndicon(IC_WINDOWS);
        } else if (id == R.id.fontawesome_more_windows8) {
            setAndicon(IC_WINDOWS8);
        } else if (id == R.id.fontawesome_more_yahoo) {
            setAndicon(IC_YAHOO);
        } else {
        }
    }

    @Override
    protected Typeface getTypeface() {
        return Typeface.createFromAsset(getContext().getAssets(), FONTAWESOME_MORE_CORP_FONT);
    }
}
