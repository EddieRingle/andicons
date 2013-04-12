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

public class FontAwesomeMoreExtView extends AndiconView {

    private static final String FONTAWESOME_MORE_EXT_FONT = "fontawesome_more_ext.ttf";

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

    public FontAwesomeMoreExtView(Context context) {
        super(context);
    }

    public FontAwesomeMoreExtView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FontAwesomeMoreExtView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAndiconById(final int id) {
        if (id == R.id.fontawesome_more_accessibility_sign) {
            setAndicon(IC_ACCESSIBILITY_SIGN);
        } else if (id == R.id.fontawesome_more_adobe_pdf) {
            setAndicon(IC_ADOBE_PDF);
        } else if (id == R.id.fontawesome_more_bike_sign) {
            setAndicon(IC_BIKE_SIGN);
        } else if (id == R.id.fontawesome_more_bus_sign) {
            setAndicon(IC_BUS_SIGN);
        } else if (id == R.id.fontawesome_more_car_sign) {
            setAndicon(IC_CAR_SIGN);
        } else if (id == R.id.fontawesome_more_chrome) {
            setAndicon(IC_CHROME);
        } else if (id == R.id.fontawesome_more_css3) {
            setAndicon(IC_CSS3);
        } else if (id == R.id.fontawesome_more_firefox) {
            setAndicon(IC_FIREFOX);
        } else if (id == R.id.fontawesome_more_html5) {
            setAndicon(IC_HTML5);
        } else if (id == R.id.fontawesome_more_ie) {
            setAndicon(IC_IE);
        } else if (id == R.id.fontawesome_more_layers) {
            setAndicon(IC_LAYERS);
        } else if (id == R.id.fontawesome_more_map) {
            setAndicon(IC_MAP);
        } else if (id == R.id.fontawesome_more_ms_excel) {
            setAndicon(IC_MS_EXCEL);
        } else if (id == R.id.fontawesome_more_ms_ppt) {
            setAndicon(IC_MS_PPT);
        } else if (id == R.id.fontawesome_more_ms_word) {
            setAndicon(IC_MS_WORD);
        } else if (id == R.id.fontawesome_more_opera) {
            setAndicon(IC_OPERA);
        } else if (id == R.id.fontawesome_more_rss_sign) {
            setAndicon(IC_RSS_SIGN);
        } else if (id == R.id.fontawesome_more_safari) {
            setAndicon(IC_SAFARI);
        } else if (id == R.id.fontawesome_more_taxi_sign) {
            setAndicon(IC_TAXI_SIGN);
        } else if (id == R.id.fontawesome_more_truck_sign) {
            setAndicon(IC_TRUCK_SIGN);
        } else if (id == R.id.fontawesome_more_zip_file) {
            setAndicon(IC_ZIP_FILE);
        } else {
        }
    }

    @Override
    protected Typeface getTypeface() {
        return Typeface.createFromAsset(getContext().getAssets(), FONTAWESOME_MORE_EXT_FONT);
    }
}
