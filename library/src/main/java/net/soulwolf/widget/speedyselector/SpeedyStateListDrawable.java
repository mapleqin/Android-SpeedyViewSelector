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

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.NonNull;

/**
 * author: Soulwolf Created on 2015/8/8 17:27.
 * email : Ching.Soulwolf@gmail.com
 *
 *  * Lets you assign a number of graphic images to a single Drawable and swap out the visible item by a string
 * ID value.
 * <p/>
 * <p>It can be defined in an XML file with the <code>&lt;selector></code> element.
 * Each state Drawable is defined in a nested <code>&lt;item></code> element. For more
 * information, see the guide to <a
 * href="{@docRoot}guide/topics/resources/drawable-resource.html">Drawable Resources</a>.</p>
 *
 * @attr ref android.R.styleable#StateListDrawable_visible
 * @attr ref android.R.styleable#StateListDrawable_variablePadding
 * @attr ref android.R.styleable#StateListDrawable_constantSize
 * @attr ref android.R.styleable#DrawableStates_state_focused
 * @attr ref android.R.styleable#DrawableStates_state_window_focused
 * @attr ref android.R.styleable#DrawableStates_state_enabled
 * @attr ref android.R.styleable#DrawableStates_state_checkable
 * @attr ref android.R.styleable#DrawableStates_state_checked
 * @attr ref android.R.styleable#DrawableStates_state_selected
 * @attr ref android.R.styleable#DrawableStates_state_activated
 * @attr ref android.R.styleable#DrawableStates_state_active
 * @attr ref android.R.styleable#DrawableStates_state_single
 * @attr ref android.R.styleable#DrawableStates_state_first
 * @attr ref android.R.styleable#DrawableStates_state_middle
 * @attr ref android.R.styleable#DrawableStates_state_last
 * @attr ref android.R.styleable#DrawableStates_state_pressed
 */
class SpeedyStateListDrawable{

    SpeedyArrayMap<int [],Drawable> mSpeedyArrayMap;

    int[] mDefaultStateSet;

    Drawable mDrawable;

    public SpeedyStateListDrawable() {
        mSpeedyArrayMap = new SpeedyArrayMap<int [],Drawable>();
    }

    public SpeedyStateListDrawable(Drawable drawable) {
        this();
        addStateDrawable(drawable);
    }

    public void addStateDrawable(Drawable drawable) {
        addStateDrawable(StateType.STATE_DEFAULT, drawable);
    }

    public void addStateDrawable(@NonNull StateType state, Drawable drawable) {
        if(drawable == null){
            return;
        }
        if(state == StateType.STATE_DEFAULT){
            this.mDefaultStateSet = state.mCurrentStateSet;
            this.mDrawable = drawable;
        }else {
            mSpeedyArrayMap.putFirst(state.getStateSet(),drawable);
        }
    }

    public StateListDrawable build(){
        StateListDrawable stateListDrawable = new StateListDrawable();
        SpeedyArrayMap<int[], Drawable> speedyArrayMap = mSpeedyArrayMap.copy();
        speedyArrayMap.put(mDefaultStateSet,mDrawable);
        for (SpeedyArrayMap.Entry<int[],Drawable> entry:speedyArrayMap.entryList()){
            stateListDrawable.addState(entry.getKey(),entry.getValue());
        }
        return stateListDrawable;
    }
}
