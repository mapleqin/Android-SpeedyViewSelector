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

/**
 * author: Soulwolf Created on 2015/8/8 17:43.
 * email : Ching.Soulwolf@gmail.com
 */
public enum StateType {

    STATE_DEFAULT(),

    STATE_FOCUSED(android.R.attr.state_focused),

    STATE_WINDOW_FOCUSED(android.R.attr.state_window_focused),

    STATE_ENABLED(android.R.attr.state_enabled),

    STATE_CHECKED(android.R.attr.state_checked),

    STATE_SELECTED(android.R.attr.state_selected),

    STATE_ACTIVATED(android.R.attr.state_activated),

    STATE_PRESSED(android.R.attr.state_pressed),

    STATE_ACTIVE(android.R.attr.state_active);

    final int[] mCurrentStateSet;

    StateType(){
        mCurrentStateSet = new int[]{};
    }

    StateType(int state) {
        this.mCurrentStateSet = new int[]{state};
    }

    public final int[] getStateSet(){
        return this.mCurrentStateSet;
    }
}
