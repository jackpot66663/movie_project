import { createStore } from 'vuex';



const movie_list = createStore({
    state(){
        return{
            list:[]
        };
    },
    mutations:{
        add_list(state,movie){
            // console.log(123)
            state.list.push(movie)

        },
        remove_list(state,movieid){
            state.list = state.list.filter(m=>m.id!=movieid);
        }
    },
    getters:{
        total_movie_list_time(state) {
            return state.list.reduce((total, m) => total + m.movieTime, 0);
        }
    }
});

export default movie_list;
