import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from '../model/product';

const API_URL = `http://localhost:3000/product`;

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[];

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<Product[]>(API_URL);
  }

  findById(id: number) {
    return this.http.get<Product>(API_URL + '/' + id);
  }

  saveProduct(product) {
    return this.http.post<Product>(API_URL, product);
  }

  updateProduct(id: number, product: Product) {
    return this.http.patch<Product>(API_URL + '/' + id, product);
  }

  deleteProduct(id: number) {
    return this.http.delete<Product>(API_URL + '/' + id);
  }

}
