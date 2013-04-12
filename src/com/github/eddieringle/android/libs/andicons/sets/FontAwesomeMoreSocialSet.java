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

public class FontAwesomeMoreSocialSet {

    public static final String FONTAWESOME_MORE_SOCIAL_FONT = "fontawesome_more_social.ttf";

    public static final int IC_DROPBOX = 0xf300;

    public static final int IC_DRUPAL = 0xf301;

    public static final int IC_GIT_FORK = 0xf302;

    public static final int IC_INSTAGRAM = 0xf303;

    public static final int IC_SHARE_THIS_SIGN = 0xf304;

    public static final int IC_SHARE_THIS = 0xf305;

    public static final int IC_FOURSQUARE_SIGN = 0xf306;

    public static final int IC_FOURSQUARE = 0xf307;

    public static final int IC_HACKER_NEWS = 0xf308;

    public static final int IC_SKYPE = 0xf309;

    public static final int IC_SPOTIFY = 0xf30a;

    public static final int IC_SOUNDCLOUD = 0xf30b;

    public static final int IC_PAYPAL = 0xf30c;

    public static final int IC_YOUTUBE_SIGN = 0xf30d;

    public static final int IC_YOUTUBE = 0xf30e;

    public static final int IC_REDDIT = 0xf30f;

    public static final int IC_BLOGGER_SIGN = 0xf310;

    public static final int IC_BLOGGER = 0xf311;

    public static final int IC_DRIBBBLE_SIGN = 0xf312;

    public static final int IC_DRIBBBLE = 0xf313;

    public static final int IC_EVERNOTE_SIGN = 0xf314;

    public static final int IC_EVERNOTE = 0xf315;

    public static final int IC_FLICKR_SIGN = 0xf316;

    public static final int IC_FLICKR = 0xf317;

    public static final int IC_FORRST_SIGN = 0xf318;

    public static final int IC_FORRST = 0xf319;

    public static final int IC_DELICIOUS = 0xf31a;

    public static final int IC_LASTFM_SIGN = 0xf31b;

    public static final int IC_LASTFM = 0xf31c;

    public static final int IC_PICASA_SIGN = 0xf31d;

    public static final int IC_PICASA = 0xf31e;

    public static final int IC_STACK_OVERFLOW = 0xf320;

    public static final int IC_TUMBLR_SIGN = 0xf321;

    public static final int IC_TUMBLR = 0xf322;

    public static final int IC_VIMEO_SIGN = 0xf323;

    public static final int IC_VIMEO = 0xf324;

    public static final int IC_WORDPRESS_SIGN = 0xf325;

    public static final int IC_WORDPRESS = 0xf326;

    public static final int IC_YELP_SIGN = 0xf327;

    public static final int IC_YELP = 0xf328;

    public static Typeface getTypeface(Context context) {
        return Typeface.createFromAsset(context.getAssets(), FONTAWESOME_MORE_SOCIAL_FONT);
    }
}
