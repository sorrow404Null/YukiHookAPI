/**
 * MIT License
 *
 * Copyright (C) 2022 HighCapable
 *
 * This file is part of YukiHookAPI.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is Created by fankes on 2022/2/2.
 */
@file:Suppress("unused")

package com.highcapable.yukihookapi.hook.xposed.proxy

import com.highcapable.yukihookapi.YukiHookAPI
import com.highcapable.yukihookapi.annotation.xposed.InjectYukiHookWithXposed
import com.highcapable.yukihookapi.hook.factory.encase

/**
 * YukiHook 的 Xposed 装载 API 调用接口
 *
 * - ⚡请在此类上添加注释 [InjectYukiHookWithXposed] 标记模块 Hook 入口
 *
 * Hook 开始时将自动调用 [onHook] 方法
 *
 * 你可以对 [YukiHookAPI] 进行配置
 *
 * 调用 [YukiHookAPI.configs] 进行配置
 *
 * ....
 *
 * YukiHookApi.configs {
 *
 * ....debugTag = "自定义 TAG"
 *
 * ....isDebug = true
 *
 * }
 *
 * ....
 *
 * 请在 [onHook] 中调用 [YukiHookAPI.encase] 或直接调用 [encase]
 *
 * 可写作如下形式：
 *
 * ....
 *
 * override fun onHook() = YukiHookAPI.encase {
 *
 * ....// Your code here.
 *
 * }
 *
 * ....
 *
 * 还可写作如下形式：
 *
 * ....
 *
 * override fun onHook() = encase {
 *
 * ....// Your code here.
 *
 * }
 *
 * ....
 *
 * 若你喜欢分类创建 Hooker - 还可以这样写：
 *
 * ......
 *
 * override fun onHook() = encase(MainHooker(), SecondHooker(), ThirdHooker() ...)
 *
 * ......
 *
 * 详情请参考 [YukiHookAPI Wiki](https://github.com/fankes/YukiHookAPI/wiki)
 */
interface YukiHookXposedInitProxy {

    /**
     * 模块装载调用入口方法
     *
     * Xposed API
     *
     * 调用 [YukiHookAPI.encase] 或直接调用 [encase] 开始 Hook
     */
    fun onHook()
}