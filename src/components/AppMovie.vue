<template>
    <div class="search-content">
      <h1 class="movie-title">SEE MOVIE</h1>
      <div class="search-container">
        <input v-model="query" placeholder="Search movies by name,..." @keyup.enter="searchMovies" class="search-input"/>
        <button @click="searchMovies" class="search-button">Search</button>
        <!-- <button @click="listAllMovies" class="list-button">Display All</button> -->
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
                <td><img :src="movie[0].moviePicture" alt="Movie Poster" class="movie-poster" /></td>
                <td class="movie-name"><a href="#" @click.prevent="showMovieDetails(movie[1])">{{ movie[0].name }}</a></td> 
                <td class="movie-director">{{ movie[0].director }}</td>  
                <td class="movie-release-date">{{ movie[0].releaseDate }}</td>
                <td class="movie-time">{{ movie[0].movieTime }} min</td>
              </tr>
            </tbody>
        </table>
      </div>
      <div class = "divider" style="margin-top: 50px;"></div>
      
    </div>
    <!-- 彈窗區域 -->
    <div v-if="isModalOpen" class="modal-overlay">
        <div class="modal">
            <div v-for="(theater, index) in movie_theaters" :key="index" class="theater-container">
                <h2 style="color: #BFA181;">{{theater.theater_name}}</h2>
                <span v-for="(time, timeIndex) in theater.time_info" :key="timeIndex">{{ time }}</span>
            </div>
            <div class="close-button-container">
                <a href="#" @click.prevent="CloseModal()">關閉</a>
            </div>
        </div>
    </div>
</template>
<script>
    import axios from 'axios';
    export default {
        name:'AppMovie',
        data() {
            return {
                movie_theaters: {},
                isModalOpen: false,
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
                    // console.log(this.movies[0].moviePicture);
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
                    const response = await axios.get(`http://localhost:8081/release`);
                    this.movies = response.data;
                    // console.log(this.movies)
                } catch (err) {
                    this.error = '無法獲取電影數據，請稍後再試。';
                } finally {
                    this.loading = false;
                }
            },

            showMovieDetails(json_str) {
                document.body.style.overflow = 'hidden';
                this.movie_theaters = JSON.parse(json_str);
                this.isModalOpen = !this.isModalOpen;
            },
            CloseModal(){
                this.isModalOpen = false;
                document.body.style.overflow = '';
            }

        },
    };
</script>
<style scoped>
.modal-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: rgba(0, 0, 0, 0.5); /* 使背景變暗 */
    z-index: 1000;
  }
  .modal {
    background-color:	#2c2c2c;
    padding: 20px;
    width: 800px;
    max-height: 400px;
    overflow-y: auto;
    border-radius: 10px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    z-index: 1001;
  }

  .close-button-container {
    margin-top: 20px;
    display: flex;
    justify-content: center;
  }
  .close-button-container a {
    text-decoration: none;
    background-color: #0A1828;
    color: #BFA181;
    padding: 10px 20px;
    border-radius: 5px;
  }
  .theater-container span{
    margin-left: 10px;
    font-size: 20px;
    color: #BFA181;
  }
</style>