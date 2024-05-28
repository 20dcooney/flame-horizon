import axios from 'axios'

const http = axios.create({
  baseURL: 'http://localhost:8080'
})

export default {
  getPlayerByRiotId(inputPlayer) {
    return http.post('/player/riotid', JSON.stringify(inputPlayer))
  }
}
