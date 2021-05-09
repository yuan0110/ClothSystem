package com.example.demo.controller;

import com.example.demo.mapper.ClothMapper;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Cloth;
import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.sql.Date;
import java.sql.Timestamp;

@RestController
@RequestMapping("/order")
public class OrderController {

    TimeUtils timeUtils = new TimeUtils();
    @Autowired
    UserMapper userMapper;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    ClothMapper clothMapper;

    /**
     * 传入布料的信息，可以是id或者名字，还有需要布料的数量，还有操作人员的id
     * @return 期待“success”
     */
    @RequestMapping("/produce")
    String produceOrder(int id){

        //0.获取布料的信息
        double clothnum=1;
        Cloth cloth = clothMapper.queryById(id);
        //0.1库存不足
        if(cloth.getStock()<clothnum){
            return "生成订单失败，库存不足！";
        }
        //0.2更新库存
        cloth.setStock(cloth.getStock()-clothnum);
        if(clothMapper.updateStockById(cloth)!=1){
            return "生成订单失败，更新库存失败！";
        }

        //1.获取前台的信息
        User user = userMapper.queryByRole("reception");
        //2. 获取当前时间
        Timestamp producetime = timeUtils.getTimeStamp();

        //3.传递order对象
        Order order= new Order();
//        order.setId(2);
        order.setClient("client");
        order.setCname(cloth.getName());
        order.setCprice(cloth.getPrice());
        order.setCnumber(clothnum);
        order.setProducetime(producetime);
//        order.setEndtime(producetime);// 订单刚刚建立，应该是没有配送时间
        order.setCsum(cloth.getPrice()*clothnum);
//        order.setDeliveryman("deliveryman");/ /订单刚刚建立，应该是没有配送员
        order.setHanderman(user.getName());

        return orderMapper.add(order)==1?"订单建立成功！":"订单建立失败！";

//        return cloth;

    }

    /**
     * 传入配送人员id和订单id完成配送
     * @return 期待"success"
     */
    @RequestMapping("/delivery")
    String deliveryOrder(int id){

        //订单先从id=1，配送送员对应是id=2；

        //1.从clothorder获取订单消息
        Order order = orderMapper.queryById(id);

        //2.获取配送员名字
        User deliveryman  = userMapper.queryByRole("deliveryman");
        //3.获取配送当前的时间
        Timestamp endtime = timeUtils.getTimeStamp();

        //4.更新clothorder数据库
        order.setDeliveryman(deliveryman.getName());
        order.setEndtime(endtime);
        int ans=orderMapper.updateById(order);
        //5.返回消息

        return ans==1?"update order success!":"update order fail!";
    }





}
