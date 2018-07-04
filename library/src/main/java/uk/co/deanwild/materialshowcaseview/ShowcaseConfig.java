package uk.co.deanwild.materialshowcaseview;

import android.graphics.Color;

import uk.co.deanwild.materialshowcaseview.shape.CircleShape;
import uk.co.deanwild.materialshowcaseview.shape.Shape;


public class ShowcaseConfig {

    public static final String DEFAULT_MASK_COLOUR = "#dd335075";
    public static final String DEFAULT_DISMISS_BUTTON_COLOR = "#cccccc";
    public static final String DEFAULT_DISMISS_TEXT_COLOR = "#ffffff";
    public static final String DEFAULT_CONTENT_TEXT_COLOR = "#ffffff";
    public static final String DEFAULT_TITLE_TEXT_COLOR = "#ffffff";
    public static final int DEFAULT_TITLE_TEXT_APPEARANCE = android.R.style.TextAppearance_Material_Title;
    public static final int DEFAULT_CONTENT_TEXT_APPEARANCE = android.R.style.TextAppearance_Material_Medium;
    public static final long DEFAULT_FADE_TIME = 300;
    public static final long DEFAULT_DELAY = 0;
    public static final Shape DEFAULT_SHAPE = new CircleShape();
    public static final int DEFAULT_SHAPE_PADDING = 10;

    private long mDelay = DEFAULT_DELAY;
    private int mMaskColour;

    private int mTitleTextColor;
    private int mContentTextColor;
    private int mDismissTextColor;
    private int mDismissButtonColor;
    private int mTitleTextAppearance;
    private int mContentTextAppearance;
    private long mFadeDuration = DEFAULT_FADE_TIME;
    private Shape mShape = DEFAULT_SHAPE;
    private int mShapePadding = DEFAULT_SHAPE_PADDING;
    private boolean renderOverNav = false;

    public ShowcaseConfig() {
        mMaskColour = Color.parseColor(ShowcaseConfig.DEFAULT_MASK_COLOUR);
        mTitleTextColor = Color.parseColor(DEFAULT_TITLE_TEXT_COLOR);
        mContentTextColor = Color.parseColor(DEFAULT_CONTENT_TEXT_COLOR);
        mDismissTextColor = Color.parseColor(DEFAULT_DISMISS_TEXT_COLOR);
        mDismissButtonColor = Color.parseColor(DEFAULT_DISMISS_BUTTON_COLOR);

        mTitleTextAppearance = DEFAULT_TITLE_TEXT_APPEARANCE;
        mContentTextAppearance = DEFAULT_CONTENT_TEXT_APPEARANCE;
    }

    public long getDelay() {
        return mDelay;
    }

    public void setDelay(long delay) {
        this.mDelay = delay;
    }

    public int getMaskColor() {
        return mMaskColour;
    }

    public void setMaskColor(int maskColor) {
        mMaskColour = maskColor;
    }

    public int getTitleTextColor() {
        return mTitleTextColor;
    }

    public int getContentTextColor() {
        return mContentTextColor;
    }

    public int getDismissButtonColor() {
        return mDismissButtonColor;
    }

    public int getDismissTextColor() {
        return mDismissTextColor;
    }

    public int getTitleTextAppearance() {
        return mTitleTextAppearance;
    }

    public int getContentTextAppearance() {
        return mContentTextAppearance;
    }

    public void setTitleTextColor(int titleTextColor) {
        this.mTitleTextColor = titleTextColor;
    }

    public void setContentTextColor(int contentTextColor) {
        this.mContentTextColor = contentTextColor;
    }

    public void setDismissTextColor(int dismissTextColor) {
        this.mDismissTextColor = dismissTextColor;
    }

    public void setDismissButtonColor(int dismissButtonColor) {
        this.mDismissButtonColor = dismissButtonColor;
    }

    public void setTitleTextAppearance(int mTitleTextAppearance) {
        this.mTitleTextAppearance = mTitleTextAppearance;
    }

    public void setContentTextAppearance(int mContentTextAppearance) {
        this.mContentTextAppearance = mContentTextAppearance;
    }

    public long getFadeDuration() {
        return mFadeDuration;
    }

    public void setFadeDuration(long fadeDuration) {
        this.mFadeDuration = fadeDuration;
    }

    public Shape getShape() {
        return mShape;
    }

    public void setShape(Shape shape) {
        this.mShape = shape;
    }

    public void setShapePadding(int padding) {
        this.mShapePadding = padding;
    }

    public int getShapePadding() {
        return mShapePadding;
    }

    public boolean getRenderOverNavigationBar() {
        return renderOverNav;
    }

    public void setRenderOverNavigationBar(boolean renderOverNav) {
        this.renderOverNav = renderOverNav;
    }
}
