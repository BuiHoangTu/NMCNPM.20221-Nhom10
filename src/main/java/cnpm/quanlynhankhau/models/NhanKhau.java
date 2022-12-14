package cnpm.quanlynhankhau.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NhanKhau {
    private String soNhanKhau;
    public boolean soNhanKhauIsChanged = false;
    private String ten;
    public boolean tenIsChanged = false;
    private String bietDanh;
    public boolean bietDanhIsChanged = false;
    private String tonGiao;
    public boolean tonGiaoIsChanged = false;
    private boolean isMale;
    public boolean isMaleIsChanged = false;
    private DiaChi thuongTru;
    public boolean thuongTruIsChanged = false;
    private LocalDate ngaySinh;
    public boolean ngaySinhIsChanged = false;
    private DiaChi noiSinh;
    public boolean noiSinhIsChanged = false;
    private DiaChi nguyenQuan;
    public boolean nguyenQuanIsChanged = false;
    private String danToc;
    public boolean danTocIsChanged = false;
    private String hoChieu;
    public boolean hoChieuIsChanged = false;
    private DiaChi diaChiHienTai;
    public boolean diaChiHienTaiIsChanged = false;
    private String trinhDoChuyenMon;
    public boolean trinhDoChuyenMonIsChanged = false;
    private String trinhDoHocVan;
    public boolean trinhDoHocVanIsChanged = false;
    private String trinhDoNgoaiNgu;
    public boolean trinhDoNgoaiNguIsChanged = false;
    private String ngheNghiep;
    public boolean ngheNghiepIsChanged = false;
    private DiaChi noiLamViec;
    public boolean noiLamViecIsChanged = false;
    private String tienAn;
    public boolean tienAnIsChanged = false;
    private LocalDate ngayChuyenDen;
    public boolean ngayChuyenDenIsChanged = false;
    private String lyDoChuyenDen;
    public boolean lyDoChuyenDenIsChanged = false;
    private String ghiChu;
    public boolean ghiChuIsChanged = false;
    private final List<TamTruVang> tamTruVangs = new ArrayList<>();
    public boolean tamTruVangsIsChanged = false;

    private ChungMinhThu chungMinhThu;
    private String idNguoiTao;
    private LocalDate ngayXoa;
    private String idNguoiXoa;
    private String lyDoXoa;
    private LocalDate ngayTao;

    public NhanKhau() {}
    public NhanKhau(String soNhanKhau, String ten, String bietDanh, String tonGiao, boolean isMale, DiaChi thuongTru, LocalDate ngaySinh, DiaChi noiSinh, DiaChi nguyenQuan, String danToc, String hoChieu, DiaChi diaChiHienTai, String trinhDoChuyenMon, String trinhDoHocVan, String trinhDoNgoaiNgu, String ngheNghiep, DiaChi noiLamViec, String tienAn, LocalDate ngayChuyenDen, String lyDoChuyenDen, String ghiChu, ChungMinhThu chungMinhThu, String idNguoiTao, LocalDate ngayXoa, String idNguoiXoa, String lyDoXoa, LocalDate ngayTao) {
        this.soNhanKhau = soNhanKhau;
        this.ten = ten;
        this.bietDanh = bietDanh;
        this.tonGiao = tonGiao;
        this.isMale = isMale;
        this.thuongTru = thuongTru;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.hoChieu = hoChieu;
        this.diaChiHienTai = diaChiHienTai;
        this.trinhDoChuyenMon = trinhDoChuyenMon;
        this.trinhDoHocVan = trinhDoHocVan;
        this.trinhDoNgoaiNgu = trinhDoNgoaiNgu;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.tienAn = tienAn;
        this.ngayChuyenDen = ngayChuyenDen;
        this.lyDoChuyenDen = lyDoChuyenDen;
        this.ghiChu = ghiChu;
        this.chungMinhThu = chungMinhThu;
        this.idNguoiTao = idNguoiTao;
        this.ngayXoa = ngayXoa;
        this.idNguoiXoa = idNguoiXoa;
        this.lyDoXoa = lyDoXoa;
        this.ngayTao = ngayTao;
    }


    public String getSoNhanKhau() {
        return soNhanKhau;
    }
    public void setSoNhanKhau(String soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        soNhanKhauIsChanged = true;
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
        tenIsChanged = true;
    }

    public String getBietDanh() {
        return bietDanh;
    }
    public void setBietDanh(String bietDanh) {
        this.bietDanh = bietDanh;
        bietDanhIsChanged = true;
    }

    public String getTonGiao() {
        return tonGiao;
    }
    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
        tonGiaoIsChanged = true;
    }

    public boolean isMale() {
        return isMale;
    }
    public void setISMale(boolean male) {
        isMale = male;
        isMaleIsChanged = true;
    }

    public DiaChi getThuongTru() {
        return thuongTru;
    }
    public void setThuongTru(DiaChi thuongTru) {
        this.thuongTru = thuongTru;
        thuongTruIsChanged = true;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
        ngaySinhIsChanged = true;
    }

    public DiaChi getNoiSinh() {
        return noiSinh;
    }
    public void setNoiSinh(DiaChi noiSinh) {
        this.noiSinh = noiSinh;
        noiSinhIsChanged = true;
    }

    public DiaChi getNguyenQuan() {
        return nguyenQuan;
    }
    public void setNguyenQuan(DiaChi nguyenQuan) {
        this.nguyenQuan = nguyenQuan;
        nguyenQuanIsChanged = true;
    }

    public String getDanToc() {
        return danToc;
    }
    public void setDanToc(String danToc) {
        this.danToc = danToc;
        danTocIsChanged = true;
    }

    public String getHoChieu() {
        return hoChieu;
    }
    public void setHoChieu(String hoChieu) {
        this.hoChieu = hoChieu;
        hoChieuIsChanged = true;
    }

    public DiaChi getDiaChiHienTai() {
        return diaChiHienTai;
    }
    public void setDiaChiHienTai(DiaChi diaChiHienTai) {
        this.diaChiHienTai = diaChiHienTai;
        diaChiHienTaiIsChanged = true;
    }

    public String getTrinhDoChuyenMon() {
        return trinhDoChuyenMon;
    }
    public void setTrinhDoChuyenMon(String trinhDoChuyenMon) {
        this.trinhDoChuyenMon = trinhDoChuyenMon;
        trinhDoChuyenMonIsChanged = true;
    }

    public String getTrinhDoHocVan() {
        return trinhDoHocVan;
    }
    public void setTrinhDoHocVan(String trinhDoHocVan) {
        this.trinhDoHocVan = trinhDoHocVan;
        trinhDoHocVanIsChanged = true;
    }

    public String getTrinhDoNgoaiNgu() {
        return trinhDoNgoaiNgu;
    }
    public void setTrinhDoNgoaiNgu(String trinhDoNgoaiNgu) {
        this.trinhDoNgoaiNgu = trinhDoNgoaiNgu;
        trinhDoNgoaiNguIsChanged = true;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
        ngheNghiepIsChanged = true;
    }

    public DiaChi getNoiLamViec() {
        return noiLamViec;
    }
    public void setNoiLamViec(DiaChi noiLamViec) {
        this.noiLamViec = noiLamViec;
        noiLamViecIsChanged = true;
    }

    public String getTienAn() {
        return tienAn;
    }
    public void setTienAn(String tienAn) {
        this.tienAn = tienAn;
        tienAnIsChanged = true;
    }

    public LocalDate getNgayChuyenDen() {
        return ngayChuyenDen;
    }
    public void setNgayChuyenDen(LocalDate ngayChuyenDen) {
        this.ngayChuyenDen = ngayChuyenDen;
        ngayChuyenDenIsChanged = true;
    }

    public String getLyDoChuyenDen() {
        return lyDoChuyenDen;
    }
    public void setLyDoChuyenDen(String lyDoChuyenDen) {
        this.lyDoChuyenDen = lyDoChuyenDen;
        lyDoChuyenDenIsChanged = true;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public String getIdNguoiTao() {
        return idNguoiTao;
    }

    public LocalDate getNgayXoa() {
        return ngayXoa;
    }

    public String getIdNguoiXoa() {
        return idNguoiXoa;
    }

    public String getLyDoXoa() {
        return lyDoXoa;
    }

    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
        ghiChuIsChanged = true;
    }

    public void addTamTruVang(TamTruVang x) {
        tamTruVangs.add(x);
        tamTruVangsIsChanged = true;
    }
    public void removeTamTruVang(TamTruVang x) {
        tamTruVangs.remove(x);
        tamTruVangsIsChanged = true;
    }
    public List<TamTruVang> getTamTruVangs() {
        return tamTruVangs;
    }

    public ChungMinhThu getChungMinhThu() {
        return chungMinhThu;
    }


    /**
     * Khai b??o t???m v???ng
     * @return M?? t???m v???ng
     */
    public String tamVang(LocalDate tuNgay, LocalDate denNgay) {
        // TODO database make tam vang
        return null;
    }

    /**
     * Save changes in this NK in database
     */
    public void commit() {
        soNhanKhauIsChanged = false;
        tenIsChanged = false;
        bietDanhIsChanged = false;
        tonGiaoIsChanged = false;
        isMaleIsChanged = false;
        thuongTruIsChanged = false;
        ngaySinhIsChanged = false;
        noiSinhIsChanged = false;
        nguyenQuanIsChanged = false;
        danTocIsChanged = false;
        hoChieuIsChanged = false;
        diaChiHienTaiIsChanged = false;
        trinhDoChuyenMonIsChanged = false;
        trinhDoHocVanIsChanged = false;
        trinhDoNgoaiNguIsChanged = false;
        ngheNghiepIsChanged = false;
        noiLamViecIsChanged = false;
        tienAnIsChanged = false;
        ngayChuyenDenIsChanged = false;
        lyDoChuyenDenIsChanged = false;
        ghiChuIsChanged = false;
        tamTruVangsIsChanged = false;
        // TODO make commit
    }
}
