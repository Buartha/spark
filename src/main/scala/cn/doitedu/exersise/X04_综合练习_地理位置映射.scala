package cn.doitedu.exersise

/**
 * 1. 将app的用户行为日志数据加载到一个hive的表中
 * 2. 将mysql中的一个gps坐标点参考表，把所有的3、4级行政单位参考点，加工成： 经度,纬度,省,市,区
 * 3. 将加工好的参考点表再次加工：把经度、维度转成geoHash码
 * 4. 对hive中的app行为日志表，进行etl（将每条数据中的经纬度坐标，转成：省市区 地理名称）并存入一张新的hive表
 *
 */
object X04_综合练习_地理位置映射 {

}
