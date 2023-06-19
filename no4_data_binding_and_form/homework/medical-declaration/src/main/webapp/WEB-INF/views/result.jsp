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
    <h3></h3>
  </center>
    <table>
      <tr>
        <td colspan="6">
          <span>Họ tên (ghi chữ Hoa)</span>
          <span class="not-null">(*)</span>
        </td>
      </tr>
      <tr>
        <td colspan="6">
            ${declarationForm.infomation.name}
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
          ${declarationForm.infomation.birthday}
        </td>
        <td colspan="2">
          ${declarationForm.infomation.gender}
        </td>
        <td colspan="2">
          ${declarationForm.infomation.country}
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
          ${declarationForm.infomation.citizenCard}
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
          ${declarationForm.infomation.vehicle}
        </td>
      </tr>
      <tr>
        <td colspan="3">Số hiệu phương tiện</td>
        <td colspan="3">Số ghế</td>
      </tr>
      <tr>
        <td colspan="3">
          ${declarationForm.infomation.vehicleID}
        </td>
        <td colspan="3">
          ${declarationForm.infomation.seatNumber}
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
        <td colspan="3">
          ${declarationForm.infomation.firstDay.day}
          -
          ${declarationForm.infomation.firstDay.month}
          -
          ${declarationForm.infomation.firstDay.year}
        </td>
        <td colspan="3">
          ${declarationForm.infomation.lastDay.day}
          -
          ${declarationForm.infomation.lastDay.month}
          -
          ${declarationForm.infomation.lastDay.year}
        </td>
      </tr>
      <tr>
        <td colspan="6">
          <span>Trong vòng 14 ngày qua, Anh/chị có đến tỉnh/thành phố nào chưa?</span>
          <span class="not-null">(*)</span>
        </td>
      </tr>
      <tr>
        <td colspan="6">
          ${declarationForm.infomation.positionOverLast14Days}
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
        <td colspan="2">${declarationForm.contactAddress.provinceOrCity}</td>
        <td colspan="2">${declarationForm.contactAddress.districtOrTown}</td>
        <td colspan="2">${declarationForm.contactAddress.wardOrCommune}</td>
      </tr>
      <tr>
        <td colspan="6">
          <span>Địa chỉ nơi ở</span>
          <span class="not-null">(*)</span>
        </td>
      </tr>
      <tr>
        <td colspan="6">${declarationForm.contactAddress.residentialAddress}</td>
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
          ${declarationForm.contactAddress.phoneNumber}
        </td>
        <td colspan="3">
          ${declarationForm.contactAddress.email}
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
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.fever}
              </td>
              <td>
                <span>Nôn/buồn nôn</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.nausea}
              </td>
            </tr>
            <tr>
              <td>
                <span>Ho</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.cough}
              </td>
              <td>
                <span>Tiêu chảy</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.diarrhea}
              </td>
            </tr>
            <tr>
              <td>
                <span>Khó thở</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.shortnessOfBreath}
              </td>
              <td>
                <span>Xuất hiện ngoài da</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.externalBleeding}
              </td>
            </tr>
            <tr>
              <td>
                <span>Đau họng</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.soreThroat}
              </td>
              <td>
                <span>Nổi ban ngoài da</span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.symptomsPast14Days.skinRash}
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
              <td colspan="2">
                ${declarationForm.exposureHistory.animalContact}
              </td>
            </tr>
            <tr>
              <td colspan="4">
                <span><b>Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV</b></span>
                <span class="not-null">(*)</span>
              </td>
              <td colspan="2">
                ${declarationForm.exposureHistory.contactWithInfected}
              </td>
            </tr>
          </table>
        </td>
      </tr>
    </table>
</div>
</body>
</html>
