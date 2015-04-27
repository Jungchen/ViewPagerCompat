/*
 * Copyright (C) 2014 Peng fei Pan <sky@xiaopan.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.compatviewpager.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.xiaopan.android.widget.PagerSlidingTabStrip;

public class PagerFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewPager_fragment);
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) view.findViewById(R.id.tabStrip_fragment);

        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), new Fragment[]{
                new ListTextFragment()
                , new ListTextFragment()
                , new ListTextFragment()
        }));
        viewPager.setCurrentItem(1);
        pagerSlidingTabStrip.setViewPager(viewPager);
    }
}
