<template>
  <div>
    <form v-on:submit.prevent="searchPlayer()">
      <input type="text" alt="Enter your Riot ID" v-model="inputPlayer.gameName" />
      <input type="text" alt="Enter your Tag Line" v-model="inputPlayer.tagLine" />
      <input type="submit" />
    </form>

    <div>
      <h1>{{ this.searchedPlayerPack.gameName }}, TagLine {{ this.searchedPlayerPack.tagLine }}</h1>
      <h2>{{ this.searchedPlayerPack.puuid }}</h2>
    </div>
  </div>
</template>

<script>
import PlayerService from '../services/PlayerService.js'

export default {
  data() {
    return {
      inputPlayer: {
        gameName: '',
        tagLine: '',
        puuid: 'none'
      },
      searchedPlayerPack: {
        gameName: 'null',
        tagLine: 'null',
        puuid: 'null'
      }
    }
  },

  components: {},
  methods: {
    searchPlayer() {
      PlayerService.getPlayerByRiotId(this.inputPlayer).then((response) => {
        this.searchedPlayerPack = response.data
      })
    }
    /*        listPrizes() {
            PrizeService.listByUserGroup(this.$store.state.currentMember.memberType).then(
                response => {
                    this.prizes = response.data;

                }
            ).catch(
                error => {
                    // Fill Later
                }
            )

        },
*/
  }
}
</script>

<style></style>
