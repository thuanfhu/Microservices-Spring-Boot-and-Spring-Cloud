# 🗑️ DELETE API trong Accounts Microservice: Giải Thích `@Transactional` và `@Modifying`

## 📝 1. Tổng Quan Về `@Transactional` và `@Modifying`

Trong microservice **Accounts** sử dụng Spring Boot, các annotation `@Transactional` và `@Modifying` được sử dụng trong **AccountRepository** để quản lý việc xóa dữ liệu (DELETE API) thông qua JPA. Hai annotation này đảm bảo thao tác xóa dữ liệu được thực hiện an toàn, nhất quán và hiệu quả trong cơ sở dữ liệu.

| **Annotation**   | **Ý Nghĩa**                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `@Transactional` | Quản lý giao dịch (transaction) để đảm bảo tính toàn vẹn dữ liệu.           |
| `@Modifying`     | Đánh dấu phương thức thay đổi dữ liệu (INSERT, UPDATE, DELETE) trong JPA.   |

---

## ⚙️ 2. Cú Pháp và Cách Sử Dụng

### 2.1. Annotation `@Transactional`

**Cú pháp**:

```java
@Transactional
```

**Mô tả**:
- Được cung cấp bởi Spring Framework (`org.springframework.transaction.annotation`).

- Đảm bảo rằng các thao tác cơ sở dữ liệu (như xóa trong `deleteByCustomerId`) được thực thi trong một giao dịch duy nhất.

- Nếu có lỗi xảy ra, giao dịch sẽ được rollback, đảm bảo tính toàn vẹn dữ liệu.

- Trong microservices, `@Transactional` thường được sử dụng để đảm bảo tính nhất quán khi thao tác với cơ sở dữ liệu quan hệ (như MySQL, PostgreSQL).

**Ví dụ**:

```java
@Transactional
@Modifying
void deleteByCustomerId(Long customerId);
```

-> Đảm bảo thao tác xóa theo `customerId` được thực hiện trong một giao dịch, rollback nếu lỗi xảy ra.

---

### 2.2. Annotation `@Modifying`

**Cú pháp**:

```java
@Modifying
```

**Mô tả**:

- Được cung cấp bởi Spring Data JPA (`org.springframework.data.jpa.repository`).

- Đánh dấu một phương thức trong repository (như `deleteByCustomerId`) là thao tác thay đổi dữ liệu (INSERT, UPDATE, DELETE) thay vì chỉ truy vấn (SELECT).

- Yêu cầu kết hợp với `@Transactional` để đảm bảo giao dịch được quản lý đúng cách.

- Thường được sử dụng với các câu lệnh JPQL hoặc native SQL trong Spring Data JPA.

**Ví dụ**:

```java
@Transactional
@Modifying
void deleteByCustomerId(Long customerId);
```

-> Thông báo cho JPA rằng phương thức này thực hiện xóa dữ liệu dựa trên `customerId`.

---

## 📌 3. Tóm Tắt

✅ **`@Transactional`**: Quản lý giao dịch, đảm bảo tính toàn vẹn dữ liệu, tự động rollback nếu lỗi xảy ra.

✅ **`@Modifying`**: Đánh dấu phương thức thay đổi dữ liệu (xóa, cập nhật, thêm) trong Spring Data JPA.

✅ **Use Case**: Xóa tài khoản theo `customerId` trong Accounts microservice, đảm bảo an toàn và nhất quán.

---