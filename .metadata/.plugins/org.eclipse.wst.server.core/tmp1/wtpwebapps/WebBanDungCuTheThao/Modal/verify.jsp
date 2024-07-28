<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xác thực đăng ký</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f8f9fa;
    margin: 0;
    padding: 0;
}

.modal-content {
    border-radius: 8px;
    border: none;
}

.modal-header {
    background-color: #007bff;
    color: #fff;
    border-bottom: none;
    border-top-left-radius: 8px;
    border-top-right-radius: 8px;
}

.modal-title {
    margin: 0;
    font-weight: bold;
}

.close {
    color: #fff;
    opacity: 1;
}

.modal-body {
    padding: 20px;
}

.form-group label {
    font-weight: bold;
}

.form-control {
    border-radius: 4px;
    border: 1px solid #ced4da;
    padding: 10px;
}

.btn-primary {
    background-color: #007bff;
    border: none;
    border-radius: 4px;
    padding: 10px 20px;
}

.btn-primary:hover {
    background-color: #0056b3;
}

.verification-input {
    width: 50px; /* Chiều rộng của từng ô nhập */
    text-align: center; /* Căn giữa nội dung */
    margin-right: 10px; /* Khoảng cách giữa các ô nhập */
    font-size: 1.5rem; /* Kích thước chữ trong ô nhập */
    border-radius: 4px; /* Bo góc nhẹ */
    border: 1px solid #ced4da; /* Đường viền nhẹ */
    padding: 10px; /* Khoảng cách bên trong ô nhập */
}

.verification-input:last-child {
    margin-right: 0; /* Loại bỏ khoảng cách bên phải của ô nhập cuối cùng */
}

.form-group {
    margin-bottom: 1rem; /* Khoảng cách dưới form-group */
}
</style>
<script>
document.addEventListener('DOMContentLoaded', function() {
    var inputs = document.querySelectorAll('.verification-input');
    var hiddenInput = document.getElementById('verificationCode');

    inputs.forEach(function(input, index) {
        input.addEventListener('input', function(e) {
            if (this.value.length === 1 && index < inputs.length - 1) {
                inputs[index + 1].focus();
            }
        });

        input.addEventListener('keydown', function(e) {
            if (e.key === 'Backspace' && this.value.length === 0 && index > 0) {
                inputs[index - 1].focus();
            }
        });
    });

    document.getElementById('verifyForm').addEventListener('submit', function(e) {
        var verificationCode = '';
        inputs.forEach(function(input) {
            verificationCode += input.value;
        });
        hiddenInput.value = verificationCode;
    });
});
</script>
</head>
<body>
    <div class="modal fade" id="verifyModal" tabindex="-1" role="dialog" aria-labelledby="verifyModalLabel" aria-hidden="true"  data-backdrop="static" data-keyboard="false">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="verifyModalLabel">Xác thực đăng ký</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body" style="text-align: center;">
                   
                <form id="verifyForm" action="VerifyServlet" method="post">
    <div class="form-group">
        <label for="verificationCode">Mã xác thực</label>
        <div class="d-flex justify-content-between">
            <input type="text" class="form-control verification-input" id="verificationCode1" name="verificationCode1" maxlength="1" required>
            <input type="text" class="form-control verification-input" id="verificationCode2" name="verificationCode2" maxlength="1" required>
            <input type="text" class="form-control verification-input" id="verificationCode3" name="verificationCode3" maxlength="1" required>
            <input type="text" class="form-control verification-input" id="verificationCode4" name="verificationCode4" maxlength="1" required>
            <input type="text" class="form-control verification-input" id="verificationCode5" name="verificationCode5" maxlength="1" required>
            <input type="text" class="form-control verification-input" id="verificationCode6" name="verificationCode6" maxlength="1" required>
        </div>
        <small class="form-text text-muted">Vui lòng nhập 6 chữ số.</small>
    </div>
    <input type="hidden" id="verificationCode" name="verificationCode" />
    <button type="submit" class="btn btn-primary">Xác thực</button>
</form>
                </div>
            </div>
        </div>
    </div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
