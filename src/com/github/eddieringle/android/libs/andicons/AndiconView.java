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

package com.github.eddieringle.android.libs.andicons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.PaintDrawable;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.View.MeasureSpec.EXACTLY;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public abstract class AndiconView extends RelativeLayout {

    private Typeface mTypeface = null;

    private PaintDrawable mPaintDrawable;

    private TextView mTextView;

    private float mCornerRadius = 0.0f;

    private int mCurrentAndicon = 0x0000;

    public AndiconView(Context context) {
        super(context);
        initialize(null);
    }

    public AndiconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(attrs);
    }

    public AndiconView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialize(attrs);
    }

    protected abstract void setAndiconById(final int id);

    protected abstract Typeface getTypeface();

    protected void initialize(AttributeSet attrs) {
        if (mTypeface == null) {
            mTypeface = getTypeface();
        }

        mPaintDrawable = new PaintDrawable(Color.TRANSPARENT);
        mPaintDrawable.setCornerRadius(mCornerRadius);
        setBackgroundDrawable(mPaintDrawable);

        mTextView = new TextView(getContext());
        mTextView.setBackgroundDrawable(null);
        mTextView.setTypeface(mTypeface);
        mTextView.setTextColor(Color.WHITE);
        LayoutParams textViewParams = new LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
        textViewParams.addRule(CENTER_IN_PARENT);
        addView(mTextView, textViewParams);

        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
        }
        setLayoutParams(layoutParams);

        if (attrs != null) {
            int[] handledAttrs = {
                    android.R.attr.textSize,
                    android.R.attr.textColor,
                    android.R.attr.radius
            };
            final TypedArray attrArray = getContext().obtainStyledAttributes(attrs, handledAttrs);
            setGlyphSize(attrArray.getDimension(0, 24));
            mTextView.setTextColor(attrArray.getColor(1, Color.WHITE));
            mCornerRadius = attrArray.getDimension(2, mCornerRadius);
            mPaintDrawable.setCornerRadius(mCornerRadius);
        }
        setAndiconById(getId());
    }

    public PaintDrawable getPaintDrawable() {
        return mPaintDrawable;
    }

    public TextView getTextView() {
        return mTextView;
    }

    public AndiconView setAndicon(final int icon) {
        mCurrentAndicon = icon;
        if (mTextView.getPaint() != null) {
            mTextView.setText(Html.fromHtml("&#x" + Integer.toHexString(mCurrentAndicon) + ";"));
        }

        /*
         * A hack to get rid of the bottom padding beneath these glyphs.
		 * setIncludeFontPadding(false) just causes a load of other problems, so this is really
		 * the only decent solution at the moment.
		 */
        mTextView.setPadding(0, 0, 0, Math.round(mTextView.getPaint().ascent() / 10.0f));
        return this;
    }

    public AndiconView setTileCornerRadius(final float cornerRadius) {
        mCornerRadius = cornerRadius;
        mPaintDrawable.setCornerRadius(mCornerRadius);
        return this;
    }

    public AndiconView setShowTile(final boolean showBackground) {
        mPaintDrawable.setVisible(showBackground, false);
        return this;
    }

    public AndiconView setTileColor(final int color) {
        mPaintDrawable.getPaint().setColor(color);
        return this;
    }

    public AndiconView setGlyphSize(final float size) {
        mTextView.setTextSize(size);
        return setAndicon(mCurrentAndicon);
    }

    public AndiconView setGlyphColor(final int color) {
        mTextView.setTextColor(color);
        return this;
    }

    public Bitmap toBitmap(final int sizing) {
        if (!(getMeasuredHeight() > 0 && getMeasuredWidth() > 0)) {
            measure(MeasureSpec.makeMeasureSpec(sizing, EXACTLY),
                    MeasureSpec.makeMeasureSpec(sizing, EXACTLY));
            layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        final Bitmap bmp = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(),
                Bitmap.Config.ARGB_8888);
        final Canvas cvs = new Canvas(bmp);
        draw(cvs);
        return bmp;
    }

    public Bitmap toBitmap() {
        return toBitmap(WRAP_CONTENT);
    }

    public BitmapDrawable toDrawable(final int sizing) {
        return new BitmapDrawable(getResources(), toBitmap(sizing));
    }

    public BitmapDrawable toDrawable() {
        return toDrawable(WRAP_CONTENT);
    }

    @Override
    public void setId(final int id) {
        super.setId(id);
        setAndiconById(id);
    }
}
