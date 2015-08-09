/**
 * <pre>
 * Copyright 2015 Soulwolf Ching
 * Copyright 2015 The Android Open Source Project for Android-SpeedyViewSelector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
package net.soulwolf.widget.speedyselector;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.util.AttributeSet;
import android.widget.GridLayout;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * author: Soulwolf Created on 2015/8/8 15:43.
 * email : Ching.Soulwolf@gmail.com
 */
class GradientDrawableWrapper extends GradientDrawable{


    GradientDrawableWrapper(float radius,@ColorInt int color) {
        this(radius,false,0,color);
    }

    GradientDrawableWrapper(float radius,boolean justBorder,float borderWidth,@ColorInt int color) {
        this();
        setCornerRadius(radius);
        if(justBorder){
            setStroke(Math.round(borderWidth),color);
        }else {
            setColor(color);
        }
    }

    GradientDrawableWrapper() {
        super();
    }

    GradientDrawableWrapper(Orientation orientation, int[] colors) {
        super(orientation, colors);
    }

    @Override
    public boolean getPadding(Rect padding) {
        return super.getPadding(padding);
    }

    @Override
    public void setCornerRadii(float[] radii) {
        super.setCornerRadii(radii);
    }

    @Override
    public void setCornerRadius(float radius) {
        super.setCornerRadius(radius);
    }

    @Override
    public void setStroke(int width, int color) {
        super.setStroke(width, color);
    }

    @Override
    public void setStroke(int width, ColorStateList colorStateList) {
        super.setStroke(width, colorStateList);
    }

    @Override
    public void setStroke(int width, int color, float dashWidth, float dashGap) {
        super.setStroke(width, color, dashWidth, dashGap);
    }

    @Override
    public void setStroke(int width, ColorStateList colorStateList, float dashWidth, float dashGap) {
        super.setStroke(width, colorStateList, dashWidth, dashGap);
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }

    @Override
    public void setShape(int shape) {
        super.setShape(shape);
    }

    @Override
    public void setGradientType(int gradient) {
        super.setGradientType(gradient);
    }

    @Override
    public void setGradientCenter(float x, float y) {
        super.setGradientCenter(x, y);
    }

    @Override
    public void setGradientRadius(float gradientRadius) {
        super.setGradientRadius(gradientRadius);
    }

    @Override
    public float getGradientRadius() {
        return super.getGradientRadius();
    }

    @Override
    public void setUseLevel(boolean useLevel) {
        super.setUseLevel(useLevel);
    }

    @Override
    public Orientation getOrientation() {
        return super.getOrientation();
    }

    @Override
    public void setOrientation(Orientation orientation) {
        super.setOrientation(orientation);
    }

    @Override
    public void setColors(int[] colors) {
        super.setColors(colors);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public void setColor(int argb) {
        super.setColor(argb);
    }

    @Override
    public void setColor(ColorStateList colorStateList) {
        super.setColor(colorStateList);
    }

    @Override
    protected boolean onStateChange(int[] stateSet) {
        return super.onStateChange(stateSet);
    }

    @Override
    public boolean isStateful() {
        return super.isStateful();
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override
    public void setAlpha(int alpha) {
        super.setAlpha(alpha);
    }

    @Override
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override
    public void setDither(boolean dither) {
        super.setDither(dither);
    }

    @Override
    public ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        super.setColorFilter(cf);
    }

    @Override
    public void setTintList(ColorStateList tint) {
        super.setTintList(tint);
    }

    @Override
    public void setTintMode(PorterDuff.Mode tintMode) {
        super.setTintMode(tintMode);
    }

    @Override
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override
    protected void onBoundsChange(Rect r) {
        super.onBoundsChange(r);
    }

    @Override
    protected boolean onLevelChange(int level) {
        return super.onLevelChange(level);
    }

    @Override
    public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(r, parser, attrs, theme);
    }

    @Override
    public void applyTheme(Resources.Theme t) {
        super.applyTheme(t);
    }

    @Override
    public boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override
    public int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override
    public ConstantState getConstantState() {

        return super.getConstantState();
    }

    @Override
    public void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override
    public Drawable mutate() {
        return super.mutate();
    }
}
