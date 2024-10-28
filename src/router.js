import { createRouter, createWebHistory } from 'vue-router'
import AppMovie from './components/AppMovie.vue';
import AppResume from './components/AppResume.vue';

const routes = [
    { path:'/',redirect:'/about'},
    { path: '/about', component: AppResume },
    { path: '/', component: AppMovie }
    
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
