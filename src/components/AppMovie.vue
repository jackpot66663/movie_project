<template>
    <div class="search-content">
      <h1 class="movie-title">SEE MOVIE</h1>
      <div class="search-container">
        <input v-model="query" placeholder="Search movies by name,type,..." @keyup.enter="searchMovies" class="search-input"/>
        <button @click="searchMovies" class="search-button">Search</button>
        <button @click="listAllMovies" class="list-button">Display All</button>
        <button @click="listRecentMovies" class="release-button">Out Now</button>
      </div>

      <div class="search-result">
        <div v-if="loading" class="loading">加載中...</div>
        <div v-if="error" class="error">{{ error }}</div>
        <table v-if="movies.length" class="movie-table">
            <thead>
                <tr>
                    <th></th>
                    <th style="width: 200px;">Name</th>
                    <th>Director</th>
                    <th>Release Date</th>
                    <th>Time</th>
                </tr>
            </thead>
            <tbody>
              <tr v-for="movie in movies" :key="movie.id" class="movie-item-container">
                <td><img :src="movie.moviePicture" alt="Movie Poster" class="movie-poster" /></td>
                <td class="movie-name">{{ movie.name }}</td> 
                <td class="movie-director">{{ movie.director }}</td>  
                <td class="movie-release-date">{{ movie.releaseDate }}</td>
                <td class="movie-time">{{ movie.movieTime }} min</td>
              </tr>
            </tbody>
        </table>
      </div>
      <div class = "divider" style="margin-top: 50px;"></div>
    </div>
</template>
<script>
    import axios from 'axios';
    export default {
        name:'AppMovie',
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
            },
            async listRecentMovies(){
                this.loading = true;
                this.error = null;
                try {
                    const response = await axios.get(`http://localhost:8081/recentAll`);
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