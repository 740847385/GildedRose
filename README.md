常规商品
1.given 没有过保,价值大于0 when按天更新 then保质期和价值都减1
2.given 没有过保 价值等于0 when按天更新 then 保质期减1 价值为0
3.given 过保 价值大于1 when按天更新 then 保质期减1 价值为2
4.given 过保 价值等于1 when按天更新 then 保质期减1  价值0


陈年干酪
1.given 没有过保,价值小于50 when按天更新 then保质期减1 价值加1
2.given 没有过保,价值等于50 when按天更新 then保质期减1 价值任为50
2.given 过保,价值小于49 when按天更新 then保质期减1 价值加2
2.given 过保,价值等于49 when按天更新 then保质期减1 价值加50

后台门票
1.given 提前10天以上 价值小于50 when按天更新 then保质期减1 价值加1
1.given 提前10天以上 价值等于50 when按天更新 then保质期减1 价值仍为50
1.given 提前5~10天以上 价值小于49 when按天更新 then保质期减1 价值加2
1.given 提前5~10天以上 价值等于49 when按天更新 then保质期减1 价值仍为50
1.given 提前5天以内 价值小于48 when按天更新 then保质期减1 价值加3
1.given 提前5天以内 价值等于48 when按天更新 then保质期减1 价值为50
1.given 过保 价值0~50任意值 when按天更新 then保质期减1 价值为0

萨菲罗斯
1.given 保质期大于0 价值为0~50的任意值,when 按天更新 then 保质期和价值均不变
