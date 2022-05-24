import {BenhNhan} from './benh-nhan';

export interface BenhAn {
  id?: number;
  maBenhAn?: string;
  benhNhan?: BenhNhan;
  ngayNhapVien?: string;
  ngayRaVien?: string;
  lyDoNhapVien?: string;
  phuongPhapDieuTri: string;
  baSiDieuTri?: string;
}
