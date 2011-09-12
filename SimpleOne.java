/**
 * @author: ahuaxuan(���ٻ�)
 * @date: 2010-2-8 10:28:02
 * @version: $$id$$
 */
public class SampleOne {
    static Cassandra.Client cassandraClient;


    private static void init() throws TTransportException {
        String server = "localhost";
        int port = 9160;

        /* ����ָ��cassandra server�ĵ�ַ */
        TTransport socket = new TSocket(server, port);
        System.out.println(" connected to " + server + ":" + port + ".");


        /* ָ��ͨ��Э��Ϊ��������Э�� */
        TBinaryProtocol binaryProtocol = new TBinaryProtocol(socket, false, false);
        cassandraClient = new Cassandra.Client(binaryProtocol);


        /* ����ͨ������ */
        socket.open();
    }


    public static void main(String[] args) throws TException, TimedOutException, InvalidRequestException, UnavailableException, NotFoundException {
        /* ��ʼ������ */
        init();


        /* ѡ����Ҫ������Keyspaces�� �����������ݿ�ı� */
        String keyspace= "Keyspace1";
        String row = "row007";


        /* ����һ��column path */
        ColumnPath col = new ColumnPath("Standard1", null, "ahuaxuan".getBytes());


        /* ִ�в��������ָ��keysapce, row, col, ���������ݣ� ������������һ����timestamp�� ����һ����consistency_level
          * timestamp������������һ���Ա�֤�ģ� ��consistency_level�������������ݷֲ��Ĳ��ԣ�ǰ�ߵ�����������bigtable, ���ߵ�����������dynamo
          */
        cassandraClient.insert(keyspace, row, col, "val1".getBytes(), 1, 1);

        /* ȡ���ո�����ȥ��ֵ��ȡֵ�����̺Ͳ�����������ƣ�Ҳ��Ҫָ��keyspace, row, col, ���һ��������consistency_level */
        Column column = cassandraClient.get(keyspace, row, col, 1).column;

        System.out.println("read row " + row);
        System.out.println("column name" + new String(column.name));
        System.out.println("column value" + ":" + new String(column.value));
        System.out.println("column timestamp" + ":" + (column.timestamp));
    }
}

