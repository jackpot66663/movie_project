import { createApp } from 'vue'
import { createHead } from '@vueuse/head'
import App from './App.vue'
import router from './router'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faPhone, faEnvelope, faShoppingCart} from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import movie_list from './movie_list'

library.add(faPhone,faEnvelope,faShoppingCart)


const app = createApp(App)
const head = createHead()
app.use(head)
app.use(router)
app.use(movie_list)
app.component('font-awesome-icon', FontAwesomeIcon)

app.mount('#app')
