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
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;

/**
 * author: Soulwolf Created on 2015/8/9 14:23.
 * email : Ching.Soulwolf@gmail.com
 */
class SpeedyColorStateList{

    SpeedyArrayMap<int[],Integer> mColorStateList;

    int[] mDefaultStateSet;

    int mDefaultStateColor;

    public SpeedyColorStateList(@ColorInt int defaultColor){
        this.mColorStateList = new SpeedyArrayMap<int[],Integer>();
        addStateColor(defaultColor);
    }

    public void addStateColor(@ColorInt int color){
        addStateColor(StateType.STATE_DEFAULT,color);
    }

    public void addStateColor(@NonNull StateType state,@ColorInt int color){
        if(state == StateType.STATE_DEFAULT){
            this.mDefaultStateSet = state.mCurrentStateSet;
            this.mDefaultStateColor = color;
        }else {
            mColorStateList.putFirst(state.getStateSet(), color);
        }
    }

    public ColorStateList build(){
        SpeedyArrayMap<int[], Integer> speedyArrayMap = mColorStateList.copy();
        speedyArrayMap.put(mDefaultStateSet,mDefaultStateColor);
        int size = speedyArrayMap.size();
        int[][] stateSet = new int[size][];
        int [] colors = new int[size];
        for (int index=0;index<size;index++){
            stateSet[index] = speedyArrayMap.keyAt(index);
            colors[index] = speedyArrayMap.valueAt(index);
        }
        return new ColorStateList(stateSet,colors);
    }
}
