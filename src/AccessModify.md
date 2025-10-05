Công cụ tìm kiếm không cần thiết.

Access modifiers trong Java là các từ khóa dùng để đặt **mức độ truy cập** (hay phạm vi hiển thị) cho các **lớp** (classes), **trường** (fields), **phương thức** (methods) và **hàm tạo** (constructors). Chúng kiểm soát việc các thành phần này có thể được truy cập từ đâu.

Hãy tưởng tượng **access modifiers** như các loại khóa khác nhau cho các phòng trong một ngôi nhà 🏠, quyết định ai được phép bước vào:

---

## 🔑 Các loại Access Modifiers trong Java

Java có 4 mức độ truy cập chính:

### 1. `private` (Riêng tư)
* **Phạm vi truy cập:** Chỉ có thể truy cập **bên trong chính lớp đó** mà nó được khai báo.
* **Ví dụ:** Như một chiếc két sắt 🔒 trong phòng ngủ. Chỉ có bạn (bản thân lớp đó) mới biết và mở được nó.
* **Sử dụng:** Thường dùng để bảo vệ dữ liệu nội bộ của một đối tượng, không cho phép thay đổi trực tiếp từ bên ngoài.

### 2. (Default/Package-private) (Mặc định/Truy cập cấp Package)
* **Phạm vi truy cập:** Có thể truy cập **bên trong cùng một package** (thư mục) mà nó được khai báo.
* **Lưu ý:** Bạn **không** dùng từ khóa nào cả. Khi không có modifier nào được chỉ định, nó là mặc định.
* **Ví dụ:** Như một phòng khách mở 🎉. Bất kỳ ai sống trong cùng một căn hộ (cùng package) đều có thể vào.
* **Sử dụng:** Cho các lớp/thành phần chỉ cần dùng nội bộ trong một nhóm các lớp liên quan.

### 3. `protected` (Được bảo vệ)
* **Phạm vi truy cập:** Có thể truy cập **bên trong cùng package** (giống default) **VÀ** bởi **các lớp con** (subclasses) **ở bất kỳ package nào** khác.
* **Ví dụ:** Như một món đồ gia truyền 📜. Chỉ những người trong nhà (cùng package) và con cháu (lớp con) mới được phép chạm vào, ngay cả khi con cháu đã chuyển đi nơi khác.
* **Sử dụng:** Cho phép các lớp con kế thừa và sử dụng, ngay cả khi chúng ở một package khác.

### 4. `public` (Công cộng)
* **Phạm vi truy cập:** Có thể truy cập **từ mọi nơi**. Không có hạn chế.
* **Ví dụ:** Như cánh cửa trước nhà chính 🚪. Mọi người đều có thể tìm thấy và đi qua nó (miễn là họ có đối tượng để gọi).
* **Sử dụng:** Cho các thành phần cần phải được sử dụng rộng rãi, chẳng hạn như phương thức chính (`main`) hoặc các hằng số.

---

## 📈 Tóm tắt mức độ truy cập

Bảng sau sắp xếp các modifiers theo mức độ **mở rộng** của phạm vi truy cập:

| Modifier | Cùng Class (Lớp đó) | Cùng Package (Thư mục đó) | Lớp con (Khác Package) | Mọi nơi (Khác Package) |
| :---: | :---: | :---: | :---: | :---: |
| **`private`** | ✅ | ❌ | ❌ | ❌ |
| **(default)** | ✅ | ✅ | ❌ | ❌ |
| **`protected`** | ✅ | ✅ | ✅ | ❌ |
| **`public`** | ✅ | ✅ | ✅ | ✅ |

### Tại sao chúng ta cần Access Modifiers? 🤔

Access modifiers là cốt lõi của nguyên lý **Encapsulation** (Đóng gói) trong Lập trình hướng đối tượng (OOP). Chúng giúp:

1.  **Bảo mật dữ liệu:** Ngăn chặn việc truy cập và thay đổi dữ liệu quan trọng một cách vô tình hoặc không hợp lệ (ví dụ: dùng `private` cho trường dữ liệu).
2.  **Kiểm soát:** Bạn quyết định chính xác phần nào của lớp có thể tương tác với thế giới bên ngoài, làm cho code dễ bảo trì và mở rộng hơn.