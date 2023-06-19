<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/06/2023
  Time: 4:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medical Declaration Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        td, th, tr {
            padding: 5px;
        }
        * {
            font-family: "Open Sans";
        }
        .not-null {
            color: red;
        }
        table, input, select {
            width: 100%;
        }
        .table-custom {
            border: 1px solid black;
        }
        .radio {
            width: auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <center>
            <h3>TỜ KHAI Y TẾ</h3>
            <h5>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỀ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h5>
            <p style="color:red">Khuyến cáo: khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</p>
        </center>
        <form:form modelAttribute="declarationForm" method="post" action="medical-declaration/result">
            <table>
                <tr>
                    <td colspan="6">
                        <span>Họ tên (ghi chữ Hoa)</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <form:input path="infomation.name" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <span>Năm sinh</span>
                        <span class="not-null">(*)</span>
                    </td>
                    <td colspan="2">
                        <span>Giới tính</span>
                        <span class="not-null">(*)</span>
                    </td>
                    <td colspan="2">
                        <span>Quốc tịch</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <form:input path="infomation.birthday" />
                    </td>
                    <td colspan="2">
                        <form:select path="infomation.gender">
                            <option selected>-Chọn-</option>
                            <form:option value="true">Nam</form:option>
                            <form:option value="false">Nữ</form:option>
                        </form:select>
                    </td>
                    <td colspan="2">
                        <form:select path="infomation.country">
                            <form:option value="vietnam">Việt Nam</form:option>
                            <form:option value="foreign">Nước ngoài</form:option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <span>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp </span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <form:input path="infomation.citizenCard"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <span>Thôn tin đi lại</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <form:radiobutton path="infomation.vehicle" value="plane" cssClass="radio"/>Tàu bay
                        <form:radiobutton path="infomation.vehicle" value="ship" cssClass="radio"/>Tàu thuyền
                        <form:radiobutton path="infomation.vehicle" value="car" cssClass="radio"/>Ô tô
                        <form:radiobutton path="infomation.vehicle" value="other" cssClass="radio"/>Khác (ghi rõ)
                    </td>
                </tr>
                <tr>
                    <td colspan="3">Số hiệu phương tiện</td>
                    <td colspan="3">Số ghế</td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:input path="infomation.vehicleID"/>
                    </td>
                    <td colspan="3">
                        <form:input path="infomation.seatNumber"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <span>Ngày khởi hành</span>
                        <span class="not-null">(*)</span>
                    </td>
                    <td colspan="3">
                        <span>Ngày kết thúc</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td><form:input path="infomation.firstDay.day"/></td>
                    <td><form:input path="infomation.firstDay.month"/></td>
                    <td><form:input path="infomation.firstDay.year"/></td>
                    <td><form:input path="infomation.lastDay.day"/></td>
                    <td><form:input path="infomation.lastDay.month"/></td>
                    <td><form:input path="infomation.lastDay.year"/></td>
                </tr>
                <tr>
                    <td colspan="6">
                        <span>Trong vòng 14 ngày qua, Anh/chị có đến tỉnh/thành phố nào chưa?</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <form:input path="infomation.positionOverLast14Days"/>
                    </td>
                </tr>
                <tr><td colspan="6"><b>Địa chỉ liên lạc</b></td></tr>
                <tr>
                    <td colspan="2">
                        <span>Tỉnh/ thành</span>
                        <span class="not-null">(*)</span>
                    </td>
                    <td colspan="2">
                        <span>Quận/ huyện</span>
                        <span class="not-null">(*)</span>
                    </td>
                    <td colspan="2">
                        <span>Phường/ xã</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><form:input path="contactAddress.provinceOrCity"/></td>
                    <td colspan="2"><form:input path="contactAddress.districtOrTown"/></td>
                    <td colspan="2"><form:input path="contactAddress.wardOrCommune"/></td>
                </tr>
                <tr>
                    <td colspan="6">
                        <span>Địa chỉ nơi ở</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="6"><form:input path="contactAddress.residentialAddress"/></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <span>Điện thoại</span>
                        <span class="not-null">(*)</span>
                    </td>
                    <td colspan="3">
                        <span>Email</span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <form:input path="contactAddress.phoneNumber"/>
                    </td>
                    <td colspan="3">
                        <form:input path="contactAddress.email"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <span><b>Trong vòng 14 ngày qua, Anh/chị có thấy xuất hiện dấu hiệu nào sau đây không</b></span>
                        <span class="not-null">(*)</span>
                     </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <table class="table-custom">
                            <tr>
                                <th>Triệu chứng</th>
                                <th>Có</th>
                                <th>Không</th>
                                <th>Triệu chứng</th>
                                <th>Có</th>
                                <th>Không</th>
                            </tr>
                            <tr>
                                <td>
                                    <span>Sốt</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.fever" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.fever" value="false"/>
                                </td>
                                <td>
                                    <span>Nôn/buồn nôn</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.nausea" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.nausea" value="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span>Ho</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.cough" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.cough" value="false"/>
                                </td>
                                <td>
                                    <span>Tiêu chảy</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.diarrhea" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.diarrhea" value="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span>Khó thở</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.shortnessOfBreath" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.shortnessOfBreath" value="false"/>
                                </td>
                                <td>
                                    <span>Xuất hiện ngoài da</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.externalBleeding" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.externalBleeding" value="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <span>Đau họng</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.soreThroat" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.soreThroat" value="false"/>
                                </td>
                                <td>
                                    <span>Nổi ban ngoài da</span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.skinRash" value="true"/>
                                </td>
                                <td>
                                    <form:radiobutton path="symptomsPast14Days.skinRash" value="false"/>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <span><b>Lịch sử phơi nhiễm: Trong vòng 14 ngày qua, Anh/chị có</b></span>
                        <span class="not-null">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <table class="table-custom">
                            <tr>
                                <th colspan="4"></th>
                                <th>Có</th>
                                <th>Không</th>
                            </tr>
                            <tr>
                                <td colspan="4">
                                    <span><b>Đến trang trại chăn nuôi/ chợ buôn bán động vật sống/ cơ sở giết mổ động vật/ tiếp xúc động vật</b></span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td class="radio"><form:radiobutton path="exposureHistory.animalContact" value="true"/></td>
                                <td class="radio"><form:radiobutton path="exposureHistory.animalContact" value="false"/></td>
                            </tr>
                            <tr>
                                <td colspan="4">
                                    <span><b>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV</b></span>
                                    <span class="not-null">(*)</span>
                                </td>
                                <td class="radio"><form:radiobutton path="exposureHistory.contactWithInfected" value="true"/></td>
                                <td class="radio"><form:radiobutton path="exposureHistory.contactWithInfected" value="false"/></td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="6" style="color: red">
                        Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch, thuộc quản lý của
                        Ban chỉ đạo quốc gia về Phòng chống dịch Covid-19. Khi bạn nhấn nút "Gửi" là bạn đã hiểu và đồng ý.
                    </td>
                </tr>
                <tr>
                    <th colspan="6">
                        <form:button>GỬI TỜ KHAI</form:button>
                    </th>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
