# 🗄️ Writing Spring Data JPA entities & Repositories to interact with DB tables

---

## 📌 Tổng quan về Spring Data JPA và H2 Database

`Spring Data JPA` là một module của Spring Framework, cung cấp cách tương tác với cơ sở dữ liệu (CSDL) thông qua các entity và repository. 

Nó giúp giảm mã boilerplate bằng cách cung cấp các phương thức CRUD mặc định và hỗ trợ truy vấn tùy chỉnh. Trong ví dụ này, CSDL `H2 Database (in-memory)` được sử dụng, phù hợp cho phát triển và kiểm thử.

**File `schema.sql`:**

- Là tệp SQL chứa các lệnh CREATE TABLE để tạo cấu trúc bảng trong H2 Database.

- Được Spring Boot tự động chạy khi ứng dụng khởi động (nếu cấu hình `spring.jpa.hibernate.ddl-auto=none` và `spring.sql.init.mode=always`).

- Trong ví dụ, `schema.sql` định nghĩa hai bảng: `customer` và `accounts`, ánh xạ với các entity `Customer` và `Account`.

---

## 🧩 Các Entity và Annotation trong Spring Data JPA

**Entity BaseEntity**

- Mô tả: Lớp cha trừu tượng, chứa các thuộc tính chung cho các entity như `createdAt`, `createdBy`, `updatedAt`, `updatedBy`.

- Annotation:

  - `@MappedSuperclass`: Đánh dấu lớp này là lớp cha, không ánh xạ trực tiếp thành bảng nhưng các thuộc tính được kế thừa bởi các entity con.

  - `@Column(updatable = false)`: Thuộc tính `createdAt`, `createdBy` không cho phép cập nhật sau khi tạo.

  - `@Column(insertable = false)`: Thuộc tính `updatedAt`, `updatedBy` không được ghi khi tạo mới, chỉ cập nhật khi sửa.

  - `@Getter`, `@Setter`, `@ToString` (Lombok): Tự động tạo getter, setter, và phương thức toString.

  - `@FieldDefaults(level = AccessLevel.PRIVATE)` (Lombok): Đặt tất cả thuộc tính là private.

---

**Entity Customer**

- Mô tả: Ánh xạ với bảng `customer`, biểu diễn thông tin khách hàng.

- Annotation:

  - `@Entity`: Đánh dấu lớp là một entity, ánh xạ với bảng trong CSDL.

  - `@Id`: Đánh dấu `customerId` là khóa chính.

  - `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Tự động tăng giá trị `customerId` (auto-increment).

  - `@Column(unique = true)`: Đảm bảo `email` và `mobileNumber` là duy nhất trong bảng.

  - Các annotation Lombok: `@Getter`, `@Setter`, `@ToString`, `@NoArgsConstructor`, `@AllArgsConstructor`, `@FieldDefaults`.

---

**Entity Account**

- Mô tả: Ánh xạ với bảng `accounts`, biểu diễn thông tin tài khoản.

- Annotation:

  - `@Entity`: Đánh dấu lớp là một entity.

  - `@Id` và `@GeneratedValue(strategy = GenerationType.IDENTITY)`: Định nghĩa `accountNumber` là khóa chính, tự động tăng.

  - `@Column`: Ánh xạ các thuộc tính `customerId`, `accountType`, `branchAddress` với cột trong bảng.

  - Các annotation Lombok tương tự Customer.

---

## 🗃️ Các Repository trong Spring Data JPA

**CustomerRepository**

- Mô tả: Giao diện kế thừa `JpaRepository<Customer, Long>`, cung cấp các phương thức CRUD mặc định để thao tác với bảng `customer`.

- Chức năng:

  - Tự động cung cấp các phương thức như `save()`, `findById()`, `findAll()`, `delete()`.

  - Không cần triển khai, Spring Data JPA tự động tạo mã thực thi dựa trên tên phương thức và cấu hình.

---

**AccountRepository**

- Mô tả: Tương tự `CustomerRepository`, cung cấp các phương thức CRUD cho bảng `accounts`.

- Chức năng: Hoạt động tương tự, thao tác với entity `Account`.

---

| **Thành phần**        | **Mô tả**                                         |
|----------------------|---------------------------------------------------|
| CustomerRepository   | Giao diện thao tác với bảng customer qua entity Customer. |
| AccountRepository    | Giao diện thao tác với bảng accounts qua entity Account.  |

---

## 📌 Tóm tắt kiến thức quan trọng

✅ H2 Database là CSDL in-memory, `schema.sql` định nghĩa cấu trúc bảng và được chạy tự động khi khởi động ứng dụng.

✅ Entity ánh xạ bảng CSDL, sử dụng annotation như `@Entity`, `@Id`, `@Column` để cấu hình.

✅ Repository kế thừa `JpaRepository` để cung cấp CRUD mặc định, không cần triển khai mã.

✅ Lombok giảm mã boilerplate với các annotation như `@Getter`, `@Setter`, `@FieldDefaults`.

✅ BaseEntity giúp tái sử dụng các thuộc tính chung, được kế thừa bởi các entity con.

---