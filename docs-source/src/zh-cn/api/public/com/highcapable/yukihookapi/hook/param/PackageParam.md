---
pageClass: code-page
---

::: warning

由于维护成本，`YukiHookAPI` 从 `1.3.0` 版本开始将不再会对此文档进行更新且在 `2.0.0` 版本切换为 Dokka 插件自动生成的 API 文档。

:::

# PackageParam <span class="symbol">- class</span>

```kotlin:no-line-numbers
open class PackageParam internal constructor(internal var wrapper: PackageParamWrapper?)
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 装载 Hook 的目标 APP 入口对象实现类。

## appClassLoader <span class="symbol">- field</span>

```kotlin:no-line-numbers
var appClassLoader：ClassLoader?
```

**变更记录**

`v1.0` `添加`

`v1.1.5` `修改`

可以动态修改此变量的值

`v1.2.0` `修改`

加入可空类型 (空安全)

**功能描述**

> 获取、设置当前 Hook APP 的 `ClassLoader`。

你可以在这里手动设置当前 Hook APP 的 `ClassLoader`，默认情况下会自动获取。

::: danger

如果设置了错误或无效的 **ClassLoader** 会造成功能异常，请谨慎操作。

:::

## appInfo <span class="symbol">- field</span>

```kotlin:no-line-numbers
val appInfo: ApplicationInfo
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 获取当前 Hook APP 的 `ApplicationInfo`。

## appUserId <span class="symbol">- field</span>

```kotlin:no-line-numbers
val appUserId: Int
```

**变更记录**

`v1.1.0` `新增`

**功能描述**

> 获取当前 Hook APP 的用户 ID。

机主为 `0`，应用双开 (分身) 或工作资料因系统环境不同 ID 也各不相同。

## appContext <span class="symbol">- field</span>

```kotlin:no-line-numbers
val appContext: Application?
```

**变更记录**

`v1.0.72` `新增`

`v1.1.0` `修改`

加入可空类型 (空安全)

**功能描述**

> 获取当前 Hook APP 的 `Application`。

::: danger

首次装载可能是空的，请延迟一段时间再获取或使用 **onAppLifecycle** 监听来完成。

:::

## appResources <span class="symbol">- field</span>

```kotlin:no-line-numbers
val appResources：Resources?
```

**变更记录**

`v1.0.80` `新增`

`v1.1.0` `修改`

加入可空类型 (空安全)

**功能描述**

> 获取当前 Hook APP 的 Resources。

::: danger

你只能在 **HookResources.hook** 方法体内或 **appContext** 装载完毕时进行调用。

:::

## systemContext <span class="symbol">- field</span>

```kotlin:no-line-numbers
val systemContext: Context
```

**变更记录**

`v1.1.0` `新增`

**功能描述**

> 获取当前系统框架的 `Context`。

## processName <span class="symbol">- field</span>

```kotlin:no-line-numbers
val processName: String
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 获取当前 Hook APP 的进程名称。

## packageName <span class="symbol">- field</span>

```kotlin:no-line-numbers
val packageName: String
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 获取当前 Hook APP 的包名。

## isFirstApplication <span class="symbol">- field</span>

```kotlin:no-line-numbers
val isFirstApplication: Boolean
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 获取当前 Hook APP 是否为第一个 `Application`。

## mainProcessName <span class="symbol">- field</span>

```kotlin:no-line-numbers
val mainProcessName: String
```

**变更记录**

`v1.0.70` `新增`

**功能描述**

> 获取当前 Hook APP 的主进程名称。

其对应的就是 `packageName`。

## moduleAppFilePath <span class="symbol">- field</span>

```kotlin:no-line-numbers
val moduleAppFilePath: String
```

**变更记录**

`v1.0.80` `新增`

**功能描述**

> 获取当前 Xposed 模块自身 APK 文件路径。

::: danger

作为 Hook API 装载时无法使用，会获取到空字符串。

:::

## moduleAppResources <span class="symbol">- field</span>

```kotlin:no-line-numbers
val moduleAppResources: YukiModuleResources
```

**变更记录**

`v1.0.80` `新增`

**功能描述**

> 获取当前 Xposed 模块自身 `Resources`。

::: danger

作为 Hook API 或不支持的 Hook Framework 装载时无法使用，会抛出异常。

:::

## prefs <span class="symbol">- field</span>

```kotlin:no-line-numbers
val prefs: YukiHookPrefsBridge
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 创建 `YukiHookPrefsBridge` 对象。

::: danger

作为 Hook API 装载时无法使用，会抛出异常。

:::

## prefs <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun prefs(name: String): YukiHookPrefsBridge
```

**变更记录**

`v1.0` `添加`

`v1.0.80` `修改`

将方法体进行 inline

**功能描述**

> 创建 `YukiHookPrefsBridge` 对象。

你可以通过 `name` 来自定义 Sp 存储的名称。

::: danger

作为 Hook API 装载时无法使用，会抛出异常。

:::

## dataChannel <span class="symbol">- field</span>

```kotlin:no-line-numbers
val dataChannel: YukiHookDataChannel.NameSpace
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 获取 `YukiHookDataChannel` 对象。

::: danger

作为 Hook API 装载时无法使用，会抛出异常。

:::

## resources <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun resources(): HookResources
```

**变更记录**

`v1.0.80` `新增`

**功能描述**

> 获得当前 Hook APP 的 `YukiResources` 对象。

请调用 `HookResources.hook` 方法开始 Hook。

## refreshModuleAppResources <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun refreshModuleAppResources()
```

**变更记录**

`v1.0.87` `新增`

**功能描述**

> 刷新当前 Xposed 模块自身 `Resources`。

## onAppLifecycle <span class="symbol">- method</span>

```kotlin:no-line-numbers
inline fun onAppLifecycle(isOnFailureThrowToApp: Boolean, initiate: AppLifecycle.() -> Unit)
```

**变更记录**

`v1.0.88` `新增`

`v1.1.5` `修改`

新增 `isOnFailureThrowToApp` 参数，可选择将异常在 (Xposed) 宿主环境打印而不是抛出给宿主

**功能描述**

> 监听当前 Hook APP 生命周期装载事件。

::: warning

在 **loadZygote** 中不会被装载，仅会在 **loadSystem**、**loadApp** 中装载。

作为 Hook API 装载时请使用原生的 **Application** 实现生命周期监听。

:::

## loadApp <span class="symbol">- method</span>

```kotlin:no-line-numbers
inline fun loadApp(name: String, initiate: PackageParam.() -> Unit)
```

```kotlin:no-line-numbers
fun loadApp(name: String, hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
inline fun loadApp(vararg name: String, initiate: PackageParam.() -> Unit)
```

```kotlin:no-line-numbers
fun loadApp(name: String, vararg hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
inline fun loadApp(isExcludeSelf: Boolean, initiate: PackageParam.() -> Unit)
```

```kotlin:no-line-numbers
fun loadApp(isExcludeSelf: Boolean, hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
fun loadApp(isExcludeSelf: Boolean, vararg hooker: YukiBaseHooker)
```

**变更记录**

`v1.0` `添加`

`v1.0.80` `修改`

将方法体进行 inline

`v1.1.4` `修改`

新增两个方法，可以同时装载多个 APP 与子 Hooker

`v1.1.5` `修改`

新增三个方法，可以使用参数 `isExcludeSelf` 排除模块自身

**功能描述**

> 装载并 Hook 指定、全部包名的 APP。

`name` 为 APP 的包名，后方的两个参数一个可作为 **lambda** 方法体使用，一个可以直接装载子 Hooker。

装载并 Hook 指定、全部包名的 APP。

若要装载 APP Zygote 事件，请使用 `loadZygote`。

若要 Hook 系统框架，请使用 `loadSystem`。

**功能示例**

你可以使用 `loadApp` 的 **lambda** 方法体形式或直接装载一个 Hooker。

> 示例如下

```kotlin
// 使用 lambda
loadApp(name = "com.example.test") {
    // Your code here.
}
// 使用 Hooker
loadApp(name = "com.example.test", CustomHooker)
```

若不指定 `name` 参数，则此方法体默认会过滤当前系统中全部可被 Hook 的 APP。

> 示例如下

```kotlin
// 使用 lambda
loadApp {
    // Your code here.
}
// 使用 Hooker
loadApp(hooker = CustomHooker)
```

若要在全部可被 Hook 的 APP 中过滤掉模块自身，你只需加入 `isExcludeSelf = true`。

> 示例如下

```kotlin
// 使用 lambda
loadApp(isExcludeSelf = true) {
    // Your code here.
}
// 使用 Hooker
loadApp(isExcludeSelf = true, hooker = CustomHooker)
```

若想要同时装载多个需要 Hook 的 APP，可以直接使用如下方式。

> 示例如下

```kotlin
// 同时装载多个需要 Hook 的 APP
loadApp("com.example.test", "com.example.next") {
    // Your code here.
}
```

若想要同时装载多个子 Hooker，可以直接使用如下方式，但此时只能指定一个需要 Hook 的 APP。

> 示例如下

```kotlin
// 同时装载多个子 Hooker
loadApp("com.example.test", CustomHooker1, CustomHooker2)
```

## loadZygote <span class="symbol">- method</span>

```kotlin:no-line-numbers
inline fun loadZygote(initiate: PackageParam.() -> Unit)
```

```kotlin:no-line-numbers
fun loadZygote(hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
fun loadZygote(vararg hooker: YukiBaseHooker)
```

**变更记录**

`v1.0.80` `新增`

`v1.1.4` `修改`

新增一个方法，可以同时装载多个子 Hooker

**功能描述**

> 装载 APP Zygote 事件。

方法中的两个参数一个可作为 **lambda** 方法体使用，一个可以直接装载子 Hooker。

## loadSystem <span class="symbol">- method</span>

```kotlin:no-line-numbers
inline fun loadSystem(initiate: PackageParam.() -> Unit)
```

```kotlin:no-line-numbers
fun loadSystem(hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
fun loadSystem(vararg hooker: YukiBaseHooker)
```

**变更记录**

`v1.0.82` `新增`

`v1.1.4` `修改`

新增一个方法，可以同时装载多个子 Hooker

**功能描述**

> 装载并 Hook 系统框架。

方法中的两个参数一个可作为 **lambda** 方法体使用，一个可以直接装载子 Hooker。

## withProcess <span class="symbol">- method</span>

```kotlin:no-line-numbers
inline fun withProcess(name: String, initiate: PackageParam.() -> Unit)
```

```kotlin:no-line-numbers
fun withProcess(name: String, hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
fun withProcess(vararg name: String, hooker: YukiBaseHooker)
```

```kotlin:no-line-numbers
fun withProcess(name: String, vararg hooker: YukiBaseHooker)
```

**变更记录**

`v1.0.70` `新增`

`v1.1.4` `修改`

新增两个方法，可以同时装载多个进程与子 Hooker

**功能描述**

> 装载并 Hook APP 的指定进程。

`name` 为 APP 的进程名称，后方的两个参数一个可作为 **lambda** 方法体使用，一个可以直接装载子 Hooker。

## loadHooker <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun loadHooker(hooker: YukiBaseHooker)
```

**变更记录**

`v1.0` `添加`

**功能描述**

> 装载 Hook 子类。

你可以填入 `hooker` 在 Hooker 中继续装载 Hooker。

## searchClass <span class="symbol">- method</span>

```kotlin:no-line-numbers
inline fun searchClass(name: String, async: Boolean, initiate: ClassConditions): DexClassFinder.Result
```

**变更记录**

`v1.1.0` `新增`

**功能描述**

> 通过 `appClassLoader` 按指定条件查找并得到当前 Hook APP **Dex** 中的 `Class`。

::: danger

此方法在 **Class** 数量过多及查找条件复杂时会非常耗时。

建议启用 **async** 或设置 **name** 参数，**name** 参数将在 Hook APP (宿主) 不同版本中自动进行本地缓存以提升效率。

此功能尚在实验阶段，性能与稳定性可能仍然存在问题，使用过程遇到问题请向我们报告并帮助我们改进。

:::

<h2 class="deprecated">String+VariousClass.clazz - i-ext-field</h2>

**变更记录**

`v1.0` `添加`

`v1.1.0` `作废`

请迁移到 `toClass(...)` 方法

<h2 class="deprecated">String.hasClass - i-ext-field</h2>

**变更记录**

`v1.0` `添加`

`v1.1.0` `作废`

请迁移到 `hasClass(...)` 方法

## String+VariousClass.toClass <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
fun String.toClass(loader: ClassLoader?, initialize: Boolean): Class<*>
```

```kotlin:no-line-numbers
inline fun <reified T> String.toClass(loader: ClassLoader?, initialize: Boolean): Class<T>
```

```kotlin:no-line-numbers
fun VariousClass.toClass(loader: ClassLoader?, initialize: Boolean): Class<*>
```

**变更记录**

`v1.1.0` `新增`

`v1.1.5` `修改`

新增泛型返回值 `Class<T>` 方法

新增 `initialize` 参数

**功能描述**

> 通过字符串类名、`VariousClass` 转换为 `loader` 中的实体类。

默认使用当前 `appClassLoader` 装载目标 `Class`。

**功能示例**

你可以轻松地将 `String` 类型的 `Class` 包名转为 `Class` 实例。

> 示例如下

```kotlin
"com.example.demo.DemoClass".toClass()
```

你还可以向 `loader` 参数传入你自定义的 `ClassLoader`。

> 示例如下

```kotlin
val customClassLoader: ClassLoader? = ... // 假设这个就是你的 ClassLoader
"com.example.demo.DemoClass".toClass(customClassLoader)
```

你还可以指定 `Class` 的目标类型。

> 示例如下

```kotlin
// 指定的 DemoClass 必须存在或为可访问的 stub
"com.example.demo.DemoClass".toClass<DemoClass>()
```

你还可以设置在获取到这个 `Class` 时是否自动执行其默认的静态方法块，默认情况下不会执行。

> 示例如下

```kotlin
// 获取并执行 DemoClass 默认的静态方法块
"com.example.demo.DemoClass".toClass(initialize = true)
```

默认的静态方法块在 Java 中使用如下方式定义。

> 示例如下

```java:no-line-numbers
public class DemoClass {

    static {
        // 这里是静态方法块的内容
    }

    public DemoClass() {
        // ...
    }
}
```

你还可以创建一个 `VariousClass`，并转换为实体类。

`VariousClass` 会枚举所有设置的 `Class` 并最终获得第一个存在的 `Class`。

> 示例如下

```kotlin
VariousClass("com.example.demo.DemoClass1", "com.example.demo.DemoClass2").toClass()
```

同样地，你还可以向 `loader` 参数传入你自定义的 `ClassLoader`。

> 示例如下

```kotlin
val customClassLoader: ClassLoader? = ... // 假设这个就是你的 ClassLoader
VariousClass("com.example.demo.DemoClass1", "com.example.demo.DemoClass2").toClass(customClassLoader)
```

## String+VariousClass.toClassOrNull <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
fun String.toClassOrNull(loader: ClassLoader?, initialize: Boolean): Class<*>?
```

```kotlin:no-line-numbers
inline fun <reified T> String.toClassOrNull(loader: ClassLoader?, initialize: Boolean): Class<T>?
```

```kotlin:no-line-numbers
fun VariousClass.toClassOrNull(loader: ClassLoader?, initialize: Boolean): Class<*>?
```

**变更记录**

`v1.1.0` `新增`

`v1.1.5` `修改`

新增泛型返回值 `Class<T>` 方法

新增 `initialize` 参数

**功能描述**

> 通过字符串类名、`VariousClass` 转换为 `loader` 中的实体类。

默认使用当前 `appClassLoader` 装载目标 `Class`。

找不到 `Class` 会返回 `null`，不会抛出异常。

**功能示例**

用法请参考 [String+VariousClass.toClass](#string-variousclass-toclass-i-ext-method) 方法。

## lazyClass <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun lazyClass(name: String, initialize: Boolean, loader: ClassLoaderInitializer?): LazyClass.NonNull<Any>
```

```kotlin:no-line-numbers
inline fun <reified T> lazyClass(name: String, initialize: Boolean, loader: ClassLoaderInitializer?): LazyClass.NonNull<T>
```

```kotlin:no-line-numbers
fun lazyClass(variousClass: VariousClass, initialize: Boolean, loader: ClassLoaderInitializer?): LazyClass.NonNull<Any>
```

**变更记录**

`v1.2.0` `新增`

**功能描述**

> 懒装载 `Class`。

## lazyClassOrNull <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun lazyClassOrNull(name: String, initialize: Boolean, loader: ClassLoaderInitializer?): LazyClass.Nullable<Any>
```

```kotlin:no-line-numbers
inline fun <reified T> lazyClassOrNull(name: String, initialize: Boolean, loader: ClassLoaderInitializer?): LazyClass.Nullable<T>
```

```kotlin:no-line-numbers
fun lazyClassOrNull(variousClass: VariousClass, initialize: Boolean, loader: ClassLoaderInitializer?): LazyClass.Nullable<Any>
```

**变更记录**

`v1.2.0` `新增`

**功能描述**

> 懒装载 `Class`。

## String.hasClass <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
fun String.hasClass(loader: ClassLoader?): Boolean
```

**变更记录**

`v1.1.0` `新增`

**功能描述**

> 通过字符串类名查找是否存在。

默认使用当前 `appClassLoader` 装载目标 `Class`。

**功能示例**

你可以轻松的使用此方法判断字符串中的类是否存在。

> 示例如下

```kotlin
if("com.example.demo.DemoClass".hasClass()) {
    // Your code here.
}
```

你还可以自定义其中的 `loader` 参数，默认为 `appClassLoader`。

> 示例如下

```kotlin
val customClassLoader: ClassLoader? = ... // 假设这个就是你的 ClassLoader
if("com.example.demo.DemoClass".hasClass(customClassLoader)) {
    // Your code here.
}
```

<h2 class="deprecated">findClass - method</h2>

**变更记录**

`v1.0` `添加`

`v1.0.1` `修改`

移除了 ~~`findClass(various: VariousClass)`~~ 方法

`v1.1.0` `修改`

新增 `loader` 参数

`v1.2.0` `作废`

请直接使用 `String.toClass(...)` 或 `VariousClass(...)`

## Class+VariousClass+HookClass.hook <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
inline fun Class<*>.hook(isForceUseAbsolute: Boolean, initiate: YukiMemberHookCreator.() -> Unit): YukiMemberHookCreator.Result
```

```kotlin:no-line-numbers
inline fun VariousClass.hook(initiate: YukiMemberHookCreator.() -> Unit): YukiMemberHookCreator.Result
```

```kotlin:no-line-numbers
inline fun HookClass.hook(initiate: YukiMemberHookCreator.() -> Unit): YukiMemberHookCreator.Result
```

**变更记录**

`v1.0` `添加`

`v1.0.1` `修改`

新增 `VariousClass` 的直接调用 `hook` 方法

`v1.0.2` `修改`

新增 `String` 的直接调用 `hook` 方法

`v1.0.3` `修改`

新增 `YukiMemberHookCreator.Result` 返回值

`v1.0.70` `修改`

新增 `isUseAppClassLoader` 参数

`v1.0.80` `修改`

将方法体进行 inline

`v1.1.0` `修改`

移除了 ~~`isUseAppClassLoader`~~ 参数

添加了 `isForceUseAbsolute` 参数到 `Class.hook` 方法

`v1.2.0` `修改`

作废了 ~~`String.hook`~~ 方法

**功能描述**

> Hook 方法、构造方法。

## Member+BaseFinder.BaseResult.hook <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
inline fun Member.hook(priority: YukiHookPriority): YukiMemberHookCreator.MemberHookCreator
```

```kotlin:no-line-numbers
inline fun Member.hook(priority: YukiHookPriority, initiate: YukiMemberHookCreator.MemberHookCreator.() -> Unit): YukiMemberHookCreator.MemberHookCreator.Result
```

```kotlin:no-line-numbers
inline fun BaseFinder.BaseResult.hook(priority: YukiHookPriority): YukiMemberHookCreator.MemberHookCreator
```

```kotlin:no-line-numbers
inline fun BaseFinder.BaseResult.hook(priority: YukiHookPriority, initiate: YukiMemberHookCreator.MemberHookCreator.() -> Unit): YukiMemberHookCreator.MemberHookCreator.Result
```

**变更记录**

`v1.2.0` `新增`

**功能描述**

> 直接 Hook 方法、构造方法。

::: warning

此功能尚在实验阶段，在 **1.x.x** 版本将暂定于此，在 **2.0.0** 版本将完全合并到新 API。

:::

## Array&lt;Member&gt;+List&lt;Member&gt;+BaseFinder.BaseResult.hookAll <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
inline fun Array<Member>.hookAll(priority: YukiHookPriority): YukiMemberHookCreator.MemberHookCreator
```

```kotlin:no-line-numbers
inline fun Array<Member>.hookAll(priority: YukiHookPriority, initiate: YukiMemberHookCreator.MemberHookCreator.() -> Unit): YukiMemberHookCreator.MemberHookCreator.Result
```

```kotlin:no-line-numbers
inline fun List<Member>.hookAll(priority: YukiHookPriority): YukiMemberHookCreator.MemberHookCreator
```

```kotlin:no-line-numbers
inline fun List<Member>.hookAll(priority: YukiHookPriority, initiate: YukiMemberHookCreator.MemberHookCreator.() -> Unit): YukiMemberHookCreator.MemberHookCreator.Result
```

```kotlin:no-line-numbers
inline fun BaseFinder.BaseResult.hookAll(priority: YukiHookPriority): YukiMemberHookCreator.MemberHookCreator
```

```kotlin:no-line-numbers
inline fun BaseFinder.BaseResult.hookAll(priority: YukiHookPriority, initiate: YukiMemberHookCreator.MemberHookCreator.() -> Unit): YukiMemberHookCreator.MemberHookCreator.Result
```

**变更记录**

`v1.2.0` `新增`

**功能描述**

> 直接 Hook 方法、构造方法 (批量)。

::: warning

此功能尚在实验阶段，在 **1.x.x** 版本将暂定于此，在 **2.0.0** 版本将完全合并到新 API。

:::

## HookResources.hook <span class="symbol">- i-ext-method</span>

```kotlin:no-line-numbers
inline fun HookResources.hook(initiate: YukiResourcesHookCreator.() -> Unit)
```

**变更记录**

`v1.0.80` `新增`

**功能描述**

> Hook APP 的 Resources。

::: danger

此功能将不再默认启用，如需启用，请手动设置 **InjectYukiHookWithXposed.isUsingResourcesHook**。

:::

**功能示例**

Resources Hook 为固定用法，获取 `resources` 对象，然后调用 `hook` 方法开始 Hook。

> 示例如下

```kotlin
resources().hook {
    // Your code here.
}
```

::: danger

这是固定用法，为了防止发生问题，你不可手动实现任何 **HookResources** 实例执行 **hook** 调用。

:::

将 Resources 的 Hook 设置为这样是为了与 `String.toClass(...).hook` 做到统一，使得调用起来逻辑不会混乱。

## AppLifecycle <span class="symbol">- class</span>

```kotlin:no-line-numbers
inner class AppLifecycle internal constructor(private val isOnFailureThrowToApp: Boolean)
```

**变更记录**

`v1.0.88` `新增`

`v1.1.5` `修改`

新增 `isOnFailureThrowToApp` 参数，可选择将异常在 (Xposed) 宿主环境打印而不是抛出给宿主

**功能描述**

> 当前 Hook APP 的生命周期实例处理类。

### attachBaseContext <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun attachBaseContext(result: (baseContext: Context, hasCalledSuper: Boolean) -> Unit)
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 监听当前 Hook APP 装载 `Application.attachBaseContext`。

### onCreate <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun onCreate(initiate: Application.() -> Unit)
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 监听当前 Hook APP 装载 `Application.onCreate`。

### onTerminate <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun onTerminate(initiate: Application.() -> Unit)
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 监听当前 Hook APP 装载 `Application.onTerminate`。

### onLowMemory <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun onLowMemory(initiate: Application.() -> Unit)
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 监听当前 Hook APP 装载 `Application.onLowMemory`。

### onTrimMemory <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun onTrimMemory(result: (self: Application, level: Int) -> Unit)
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 监听当前 Hook APP 装载 `Application.onTrimMemory`。

### onConfigurationChanged <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun onConfigurationChanged(result: (self: Application, config: Configuration) -> Unit)
```

**变更记录**

`v1.0.88` `新增`

**功能描述**

> 监听当前 Hook APP 装载 `Application.onConfigurationChanged`。

### registerReceiver <span class="symbol">- method</span>

```kotlin:no-line-numbers
fun registerReceiver(vararg action: String, result: (context: Context, intent: Intent) -> Unit)
```

```kotlin:no-line-numbers
fun registerReceiver(filter: IntentFilter, result: (context: Context, intent: Intent) -> Unit)
```

**变更记录**

`v1.0.88` `新增`

`v1.1.8` `修改`

新增直接使用 `IntentFilter` 注册系统广播监听

**功能描述**

> 注册系统广播监听。