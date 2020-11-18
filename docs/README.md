DreamBox开发手册
---

> 命名由来：在梦境之中，我们可以随心所欲，具有无限可能。而Box具有容器的意义，希望借此命名打造一个在足够自由的客户端视图容器


### 介绍

DreamBox是一个专为Android和iOS客户端同学打造的视图动态化框架。不同于其他跨端框架，DB的特点是：
1. 应用快。原创DSL，数量少、逻辑简单，开发者学习上手快，上线新需求从学习到落地1天即可
2. 运行快。渲染前只有一次静态解析，渲染后原生GUI框架接管，无动态解析性能损耗
3. 不仅具备UI视图动态部署能力，也支持对交互能力的动态化
4. 粒度小。基于优秀的性能，可以在最小粒度上支持动态化

此外，还吸取了其他成熟框架的长处，具备以下实用特性：
1. 支持调试阶段的Hot Reload。通过Playground、调试插件，开发者可实时预览最新效果
2. 支持自定义扩展。开发者可通过扩展框架自定义的UI视图与动作能力
3. 支持事件管道。开发者可通过事件管道机制在原生运行时和DB运行时中进行交互

DreamBox立志于打造成为具备动态化能力与优秀性能的双端视觉编辑框架，统一支撑双端开发及体验，提高产出效率。

#### 适用场景

我们的目标场景是覆盖那些弱交互、偏静态化的视图（如运营位）。在一些类型的App中，这些场景的更改频率和动态化需求较高，并不追求覆盖最复杂的场景。（这也是我们为什么没有集成虚拟机的重要原因）

**我们的目标是打造双端最“快”的视图动态化框架**

### 开发人员

- 项目发起 & 总设计：刘凯
- Android：陈靖、李泽琛、韩青暖
- iOS：刘伟民、方绍晟、张矗

### 里程碑设定

- 第一阶段：线上可用。初步完成整体框架，快速上线验证服务可用性
- 第二阶段：细节打磨。完善开发体验，并结合第一阶段效果做进一步优化，具备对外接入能力
- 第三阶段：服务整体化。接入成熟上线体系，将整体服务链条闭环
- 第四阶段：极致体验。最大化提升开发体验，结合线上IDE将开发能力拓展至非开发人群

### 沟通渠道

- 详见[反馈渠道](feedback.md)