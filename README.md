# 设计模式

### 抽象工厂模式

    抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
    该超级工厂又称为其他工厂的工厂，它提供了一种创建对象的最佳方式。
    在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

### 单例模式
    单例模式（Singleton Pattern），也叫单子模式。在应用这个模式时，单例对象的类必须保证只有一个实例存在。

    注意：
	1、单例类只能有一个实例。
	2、单例类必须自己创建自己的唯一实例。
	3、单例类必须给所有其他对象提供这一实例。

### 原型模式
    原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
    这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。