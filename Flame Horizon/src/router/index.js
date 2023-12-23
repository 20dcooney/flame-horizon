import { createRouter, createWebHistory } from 'vue-router'
import FrontPageView from '../views/FrontPageView.vue'
import StatView from '../views/StatView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: FrontPageView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/test', //NEED TO CHANGE ONCE READY TO REMOVE DEFAULT VUE PROJECT HOMEVIEW
      name: 'front',
      component: FrontPageView
    },
    {
      path: "/stats",
      name: "stats",
      component: StatView
    },
    
  ]
})

export default router
