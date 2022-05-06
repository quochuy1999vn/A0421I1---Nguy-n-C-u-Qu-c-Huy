import { Component, OnInit } from '@angular/core';
import {Article} from '../article';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  article: Article = {};
  articles: Article[];

  constructor() { }

  ngOnInit(): void {
  }

  addNewArticle() {
    this.articles.push(this.article);
  }
}
