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

public class FontAwesomeMoreSocialView extends AndiconView {

    private static final String FONTAWESOME_MORE_SOCIAL_FONT = "fontawesome_more_social.ttf";

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

    public FontAwesomeMoreSocialView(Context context) {
        super(context);
    }

    public FontAwesomeMoreSocialView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FontAwesomeMoreSocialView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAndiconById(final int id) {
        if (id == R.id.fontawesome_more_blogger) {
            setAndicon(IC_BLOGGER);
        } else if (id == R.id.fontawesome_more_blogger_sign) {
            setAndicon(IC_BLOGGER_SIGN);
        } else if (id == R.id.fontawesome_more_delicious) {
            setAndicon(IC_DELICIOUS);
        } else if (id == R.id.fontawesome_more_dribbble) {
            setAndicon(IC_DRIBBBLE);
        } else if (id == R.id.fontawesome_more_dribbble_sign) {
            setAndicon(IC_DRIBBBLE_SIGN);
        } else if (id == R.id.fontawesome_more_dropbox) {
            setAndicon(IC_DROPBOX);
        } else if (id == R.id.fontawesome_more_drupal) {
            setAndicon(IC_DRUPAL);
        } else if (id == R.id.fontawesome_more_evernote) {
            setAndicon(IC_EVERNOTE);
        } else if (id == R.id.fontawesome_more_evernote_sign) {
            setAndicon(IC_EVERNOTE_SIGN);
        } else if (id == R.id.fontawesome_more_flickr) {
            setAndicon(IC_FLICKR);
        } else if (id == R.id.fontawesome_more_flickr_sign) {
            setAndicon(IC_FLICKR_SIGN);
        } else if (id == R.id.fontawesome_more_forrst) {
            setAndicon(IC_FORRST);
        } else if (id == R.id.fontawesome_more_forrst_sign) {
            setAndicon(IC_FORRST_SIGN);
        } else if (id == R.id.fontawesome_more_foursquare) {
            setAndicon(IC_FOURSQUARE);
        } else if (id == R.id.fontawesome_more_foursquare_sign) {
            setAndicon(IC_FOURSQUARE_SIGN);
        } else if (id == R.id.fontawesome_more_git_fork) {
            setAndicon(IC_GIT_FORK);
        } else if (id == R.id.fontawesome_more_hacker_news) {
            setAndicon(IC_HACKER_NEWS);
        } else if (id == R.id.fontawesome_more_instagram) {
            setAndicon(IC_INSTAGRAM);
        } else if (id == R.id.fontawesome_more_lastfm) {
            setAndicon(IC_LASTFM);
        } else if (id == R.id.fontawesome_more_lastfm_sign) {
            setAndicon(IC_LASTFM_SIGN);
        } else if (id == R.id.fontawesome_more_paypal) {
            setAndicon(IC_PAYPAL);
        } else if (id == R.id.fontawesome_more_picasa) {
            setAndicon(IC_PICASA);
        } else if (id == R.id.fontawesome_more_picasa_sign) {
            setAndicon(IC_PICASA_SIGN);
        } else if (id == R.id.fontawesome_more_reddit) {
            setAndicon(IC_REDDIT);
        } else if (id == R.id.fontawesome_more_share_this) {
            setAndicon(IC_SHARE_THIS);
        } else if (id == R.id.fontawesome_more_share_this_sign) {
            setAndicon(IC_SHARE_THIS_SIGN);
        } else if (id == R.id.fontawesome_more_skype) {
            setAndicon(IC_SKYPE);
        } else if (id == R.id.fontawesome_more_soundcloud) {
            setAndicon(IC_SOUNDCLOUD);
        } else if (id == R.id.fontawesome_more_spotify) {
            setAndicon(IC_SPOTIFY);
        } else if (id == R.id.fontawesome_more_stack_overflow) {
            setAndicon(IC_STACK_OVERFLOW);
        } else if (id == R.id.fontawesome_more_tumblr) {
            setAndicon(IC_TUMBLR);
        } else if (id == R.id.fontawesome_more_tumblr_sign) {
            setAndicon(IC_TUMBLR_SIGN);
        } else if (id == R.id.fontawesome_more_vimeo) {
            setAndicon(IC_VIMEO);
        } else if (id == R.id.fontawesome_more_vimeo_sign) {
            setAndicon(IC_VIMEO_SIGN);
        } else if (id == R.id.fontawesome_more_wordpress) {
            setAndicon(IC_WORDPRESS);
        } else if (id == R.id.fontawesome_more_wordpress_sign) {
            setAndicon(IC_WORDPRESS_SIGN);
        } else if (id == R.id.fontawesome_more_yelp) {
            setAndicon(IC_YELP);
        } else if (id == R.id.fontawesome_more_yelp_sign) {
            setAndicon(IC_YELP_SIGN);
        } else if (id == R.id.fontawesome_more_youtube) {
            setAndicon(IC_YOUTUBE);
        } else if (id == R.id.fontawesome_more_youtube_sign) {
            setAndicon(IC_YOUTUBE_SIGN);
        } else {
        }
    }

    @Override
    protected Typeface getTypeface() {
        return Typeface.createFromAsset(getContext().getAssets(), FONTAWESOME_MORE_SOCIAL_FONT);
    }
}
