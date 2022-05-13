import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Category} from '../model/category';
const API_URL = `http://localhost:3000/category`;

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<Category[]>(API_URL);
  }

  findById(id: number) {
    return this.http.get<Category>(API_URL + '/' + id);
  }

  saveCategory(category) {
    return this.http.post<Category>(API_URL, category);
  }

  updateCategory(id: number, category: Category) {
    return this.http.patch<Category>(API_URL + '/' + id, category);
  }

  deleteCategory(id: number) {
    return this.http.delete<Category>(API_URL + '/' + id);
  }
}
