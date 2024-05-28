import axios from 'axios'

const http = axios.create({
  baseURL: 'http://localhost:8080'
})

export default {
  getMatchesByPuuid(puuid) {
    return http.get(`/match/user/`, puuid)
  }
}
