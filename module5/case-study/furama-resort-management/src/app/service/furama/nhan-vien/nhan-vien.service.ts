import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {NhanVien} from '../../../model/nhan-vien/nhan-vien';
const API_CONNECT = 'http://localhost:3000/nhan-vien';

@Injectable({
  providedIn: 'root'
})
export class NhanVienService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<NhanVien[]>(API_CONNECT);
  }

  findById(id: number) {
    return this.http.get<NhanVien>(API_CONNECT + '/' + id);
  }

  updateNhanVien(id: number, nhanVien: NhanVien) {
    return this.http.patch<NhanVien>(API_CONNECT + '/' + id, nhanVien);
  }

  deleteNhanVien(id: number) {
    return this.http.delete<NhanVien>(API_CONNECT + '/' + id);
  }
}
