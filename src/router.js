import { createRouter, createWebHistory } from 'vue-router'
import AppMovie from './components/AppMovie.vue';
import AppResume from './components/AppResume.vue';

const routes = [
    { path: '/movie', component: AppMovie },
    { path: '/', component: AppResume }
    
]

const router = createRouter({
    history: createWebHistory(),
    routes,
    scrollBehavior(to, from, savedPosition) {
        if (savedPosition) {
          return savedPosition;
        } else {
          
          return { top: 0 };
        }
    },
})
  
export default router
