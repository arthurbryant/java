/**
 * @author: ahuaxuan(张荣华)
 * @date: 2010-2-8 10:28:02
 * @version: $$id$$
 */
public class SampleOne {
    static Cassandra.Client cassandraClient;


    private static void init() throws TTransportException {
        String server = "localhost";
        int port = 9160;

        /* 首先指定cassandra server的地址 */
        TTransport socket = new TSocket(server, port);
        System.out.println(" connected to " + server + ":" + port + ".");


        /* 指定通信协议为二进制流协议 */
        TBinaryProtocol binaryProtocol = new TBinaryProtocol(socket, false, false);
        cassandraClient = new Cassandra.Client(binaryProtocol);


        /* 建立通信连接 */
        socket.open();
    }


    public static void main(String[] args) throws TException, TimedOutException, InvalidRequestException, UnavailableException, NotFoundException {
        /* 初始化连接 */
        init();


        /* 选择需要操作的Keyspaces， 可以理解成数据库的表 */
        String keyspace= "Keyspace1";
        String row = "row007";


        /* 创建一个column path */
        ColumnPath col = new ColumnPath("Standard1", null, "ahuaxuan".getBytes());


        /* 执行插入操作，指定keysapce, row, col, 和数据内容， 后面两个参数一个是timestamp， 另外一个是consistency_level
          * timestamp是用来做数据一致性保证的， 而consistency_level是用来控制数据分布的策略，前者的理论依据是bigtable, 后者的理论依据是dynamo
          */
        cassandraClient.insert(keyspace, row, col, "val1".getBytes(), 1, 1);

        /* 取出刚刚塞进去的值，取值的流程和插入的流程类似，也需要指定keyspace, row, col, 最后一个参数是consistency_level */
        Column column = cassandraClient.get(keyspace, row, col, 1).column;

        System.out.println("read row " + row);
        System.out.println("column name" + new String(column.name));
        System.out.println("column value" + ":" + new String(column.value));
        System.out.println("column timestamp" + ":" + (column.timestamp));
    }
}

