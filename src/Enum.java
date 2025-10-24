
/*
Enum (viết tắt của Enumeration - kiểu liệt kê) trong Java là một kiểu dữ liệu đặc biệt được sử dụng để định nghĩa một tập hợp các hằng số (constants) có tên rõ ràng. 🌟

Nó giúp bạn tạo ra một tập hợp các giá trị cố định, hữu hạn, giúp mã dễ đọc, dễ bảo trì và an toàn hơn so với việc sử dụng các hằng số public static final int truyền thống.
 */

enum Status{
    SUCCESS,
    FAILURE,
    PENDING
}

public class Enum {
    public static void main(String[] args) {
        Status currentStatus = Status.PENDING;

        switch (currentStatus){
            case SUCCESS:
                System.out.println("success");
                break;

            case FAILURE:
                System.out.println("failure");
                break;

            case PENDING:
                System.out.println("pending");
                break;
        }


    }
}
