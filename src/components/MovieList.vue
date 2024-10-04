<template>
    <div class="modal">
        <h2 style="color:#BFA181;text-align: center;">待看清單</h2>
        <div class="movie-list-container">
            <table v-if="list.length" class="movie-table">
                <thead>
                    <tr>
                        <th></th>
                        <th style="width: 200px;"></th>
                        <th></th>
                        <th style="width: 50px;"></th>
                    </tr>
                </thead>
                <tbody>
                <tr v-for="movie in list" :key="movie.id" class="list-table">
                    <td><img :src="movie.moviePicture" alt="Movie Poster" class="movie-poster" /></td>
                    <td class="movie-name">{{ movie.name }}</td> 
                    <td class="movie-time">{{ movie.movieTime }} min</td>
                    <td><button @click="removefromlist(movie.id)" class="remove-list-button">-</button></td>
                </tr>
                </tbody>
            </table>
            <p style="text-align: center;color: #BFA181;">總時長：{{ totalmin }} min</p>
            <div class="close-button-container">
                <a href="#" @click.prevent="CloseModal()">關閉</a>
            </div>
        </div>
    </div>
</template>

<script>
export default {
computed: {

    list() {
    return this.$store.state.list;
    },
    
    totalmin() {
    return this.$store.getters.total_movie_list_time;
    }
},
methods: {
    removefromlist(movie_id) {
        this.$store.commit('remove_list', movie_id);
    },
    CloseModal(){
        // console.log("check");
        document.body.style.overflow = '';
        this.$emit('shut_down_list',false);
    }
}
};
</script>
<style scoped>
    .remove-list-button{
        font-size: 30px;
        width: 40px;
        height: 40px;
        color: #BFA181;
        background-color: #0A1828;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    .remove-list-button:hover{
        background-color: red;
        color: #000;
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
</style>