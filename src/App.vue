<template>
  <div class="search-container">
    <input v-model="query" placeholder="輸入電影名稱" @keyup.enter="searchMovies" class="search-input"/>
    <button @click="searchMovies" class="search-button">搜尋</button>
    <button @click="listAllMovies" class="list-button">列出所有電影</button>
  </div>
  <div v-if="loading" class="loading">加載中...</div>
  <div v-if="error" class="error">{{ error }}</div>
  <ul v-if="movies.length" class="movie-list">
    <li v-for="movie in movies" :key="movie.id" class="movie-item">
      <span class="movie-name">{{ movie.name }}</span> 
      <span class="movie-director">- {{ movie.director }}</span> 
      <span class="movie-release-date">- {{ movie.releaseDate }}</span>
    </li>
  </ul>
</template>

<script>
import '@/css/app.css';
import axios from 'axios';

export default {
  data() {
    return {
      query: '',
      movies: [],
      loading: false,
      error: null,
    };
  },
  methods: {
    async searchMovies() {
      if (!this.query) return;
      this.loading = true;
      this.error = null;
      try {
        const response = await axios.get(`http://localhost:8081/search`,{params: { query: this.query }});
        this.movies = response.data;
        console.log(this.movies);
      } catch (err) {
        this.error = '查詢失敗！';
      } finally {
        this.loading = false;
      }
    },
    async listAllMovies(){
      this.loading = true;
      this.error = null;
      try {
        const response = await axios.get(`http://localhost:8081/findAll`);
        this.movies = response.data;
      } catch (err) {
        this.error = '無法獲取電影數據，請稍後再試。';
      } finally {
        this.loading = false;
      }
    }
  },
};
</script>
