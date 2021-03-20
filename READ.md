
## 第三周
1. 三种人物获取，建立连接数据库
2. 布料数据库建立，能够增删查改
3. 订单管理系统，数据建立，与Java字段的联系，Time的解决
[!Java字段对应连接](https://blog.csdn.net/u010124396/article/details/8920930?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control&dist_request_id=1328665.7529.16159749966635089&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.control)

4. 订单Order的mapper没完成
debug:
4.1 SQL：DATA DATE
4.2 order（订单）是关键字，不能做表格名
4.3 primary key（id）  要加括号
4.4 @insert和@options一起使用，虽然id为自增，但是insert时还是要有
        set id = #{id}，否则报错
-----
-----
## 第四周
4.5 订单生成部分完成（todo：该种类的stock（库存）发生更改）
完成，查询cloth后进行库存判断和更新库存

4.6 todo：订单完成配送发生更新
完成，订单配送成功，更新配送员和配送时间

5 todo：controller和service，重构(Controller --->service ----> Mapper);

6 统计信息和




