package weed3demo.demo_plus.queryProcedure;

import noear.weed.DbQueryProcedure;
import noear.weed.DbStoredProcedure;
import weed3demo.config.DbConfig;

import java.util.Date;

/**
 * Created by yuety on 2017/7/22.
 */

//如果原来是存储过程的代码，可以通过[DbQueryProcedure]快速切换过来

public class user_update2 extends DbQueryProcedure {
    public user_update2() {
        super(DbConfig.test);

        sql("update user set city=@city,vipTime=@vipTime where userID=@userID");
        set("@userID", () -> userID);
        set("@city", () -> city);
        set("@vipTime", () -> vipTime);
    }

    public long userID;
    public String city;
    public Date vipTime;
}


