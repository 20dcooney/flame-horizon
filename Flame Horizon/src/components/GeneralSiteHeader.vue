<template>
    <div id="headerContainer">
        <div id="headerText">Flame Horizon</div>
        <input type="text">
   </div>
</template>

<script>
</script>

<style scoped>

#headerContainer {
    background: linear-gradient(199deg, #f7923f, #ce0808);
    background-size: 400% 400%;

    -webkit-animation: headerAnim 11s ease infinite;
    animation: headerAnim 11s ease infinite;
    -moz-animation: headerAnim 30s ease infinite;
}

@-webkit-keyframes headerAnim {
    0%{background-position:0% 25%}
    50%{background-position:100% 76%}
    100%{background-position:0% 25%}
}
@keyframes headerAnim {
    0%{background-position:0% 25%}
    50%{background-position:100% 76%}
    100%{background-position:0% 25%}
}
@-moz-keyframes headerAnim {
    0%{background-position:0% 50%}
    50%{background-position:100% 50%}
    100%{background-position:0% 50%}
}

#headerText {
    color: white;
}

</style>