package com.didi.carmate.dreambox.core.action;

import com.didi.carmate.dreambox.core.base.DBAction;
import com.didi.carmate.dreambox.core.base.DBContext;
import com.didi.carmate.dreambox.core.base.INodeCreator;
import com.didi.carmate.dreambox.core.utils.DBLogger;
import com.didi.carmate.dreambox.core.utils.DBUtils;
import com.didi.carmate.dreambox.wrapper.Navigator;
import com.didi.carmate.dreambox.wrapper.Wrapper;

import java.util.Map;

/**
 * author: chenjing
 * date: 2020/4/30
 */
public class DBNav extends DBAction {
    private DBNav(DBContext dbContext) {
        super(dbContext);
    }

    @Override
    protected void doInvoke(Map<String, String> attrs) {
        String schema = getString(attrs.get("schema"));

        if (DBUtils.isEmpty(schema)) {
            DBLogger.e(mDBContext, "[schema] is null.");
            return;
        }

        Navigator nav = Wrapper.get(mDBContext.getAccessKey()).navigator();
        nav.navigator(mDBContext.getContext(), schema);
    }

    public static class NodeCreator implements INodeCreator {
        @Override
        public DBNav createNode(DBContext dbContext) {
            return new DBNav(dbContext);
        }
    }

    public static String getNodeTag() {
        return "nav";
    }
}